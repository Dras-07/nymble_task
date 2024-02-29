import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    @Test
    public void testPassengerInitialization() {
        Passenger passenger = new Passenger("Alice", 1, PassengerType.STANDARD);
        assertEquals("Alice", passenger.getName());
        assertEquals(1, passenger.getPassengerNumber());
        assertEquals(PassengerType.STANDARD, passenger.getType());
    }

    @Test
    public void testDeductBalance() {
        Passenger passenger = new Passenger("Alice", 1, PassengerType.STANDARD);
        passenger.setBalance(100.0);
        passenger.deductBalance(50.0);
        assertEquals(50.0, passenger.getBalance());
    }



    @Test
    public void testAddActivityEnrollPassenger() {
        // Create a passenger
        Passenger passenger = new Passenger("Alice", 1, PassengerType.STANDARD);
        passenger.setBalance(100.0);

        Activity activity = new Activity("Swimming", "Enjoy swimming in the pool", 10.0, 20, null, 0);

        PaymentSystem paymentSystem = new PaymentSystem() {
            @Override
            public void processPayment(Passenger passenger, double amount) {

            }
        };

        passenger.addActivity(activity, paymentSystem);

        assertTrue(passenger.getActivities().contains(activity));
    }

    @Test
    public void testAddActivityInsufficientBalance() {
        Passenger passenger = new Passenger("Alice", 1, PassengerType.STANDARD);
        passenger.setBalance(5.0);
    
        Activity activity = new Activity("Surfing", "Ride the waves", 15.0, 20, null, 0);
    
        PaymentSystem paymentSystem = new PaymentSystem() {
            @Override
            public void processPayment(Passenger passenger, double amount) {

            }
        };
    
        passenger.addActivity(activity, paymentSystem);
    
        assertFalse(passenger.getActivities().contains(activity));
    }
    

    @Test
    public void testDeductBalanceForPaymentSystem() {
        Passenger passenger = new Passenger("Alice", 1, PassengerType.STANDARD);
        passenger.setBalance(100.0);

        double amountToDeduct = 50.0;
        passenger.deductBalanceForPaymentSystem(amountToDeduct);

        assertEquals(50.0, passenger.getBalance());
    }
}
