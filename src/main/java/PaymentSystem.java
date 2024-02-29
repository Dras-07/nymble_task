public class PaymentSystem {
    public void processPayment(Passenger passenger, double amount) {
        double discountedAmount = calculateDiscountedAmount(passenger, amount);

        passenger.deductBalanceForPaymentSystem(discountedAmount);
        System.out.println("Payment processed for passenger " + passenger.getName() + " (" + passenger.getType());
    }

 
    
    public double calculateDiscountedAmount(Passenger passenger, double amount) {
        double discountRate = 0.0;
        if (passenger.getType() == PassengerType.GOLD) {
            discountRate = 0.1; 
        } else if (passenger.getType() == PassengerType.PREMIUM) {
            discountRate = 1.0; 
        }
        return amount * (1 - discountRate);
    }
}
