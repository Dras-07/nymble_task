import java.util.List;
import java.util.ArrayList;

public class Passenger {
    private String name;
    private int passengerNumber;
    private PassengerType type;
    private double balance;
    private List<Activity> activities;

    public Passenger(String name, int passengerNumber, PassengerType type) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.type = type;
        this.balance = 0;
        this.activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public PassengerType getType() {
        return type;
    }

    public void setType(PassengerType type) {
        this.type = type;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void addActivity(Activity activity, PaymentSystem paymentSystem) {
        double activityCost = activity.getCost();
        if (activity.enrollPassenger() && balance >= activityCost) {
            paymentSystem.processPayment(this, activityCost);
            activities.add(activity);
        } else {
            System.out.println("Unable to enroll in activity " + activity.getName() + ".");
            if (!activity.enrollPassenger()) {
                System.out.println("The activity is already at full capacity.");
            }
            if (balance < activityCost) {
                System.out.println("Insufficient balance to enroll in this activity.");
            }
        }
    }
    
    

    public void deductBalanceForPaymentSystem(double amount) {
        deductBalance(amount);
    }
    

   public void deductBalance(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount to deduct must be positive");
        }
        if (balance < amount) {
            throw new IllegalStateException("Insufficient balance");
        }
        balance -= amount;
    }
    

    public void printDetails() {
        System.out.println("Passenger Details:");
        System.out.println("Name: " + name);
        System.out.println("Passenger Number: " + passengerNumber);
        if (balance > 0) {
            System.out.println("Balance: " + balance);
        }
        System.out.println("Activities:");
        for (Activity activity : activities) {
            System.out.println("Activity: " + activity.getName());
            System.out.println("Destination: " + activity.getDestination().getName());
            System.out.println("Price Paid: " + activity.getCost());
        }
    }
}
