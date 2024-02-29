// PaymentSystemTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentSystemTest {

    @Test
    public void testCalculateDiscountedAmountGold() {
        Passenger passenger = new Passenger("Alice", 1, PassengerType.GOLD);
        PaymentSystem paymentSystem = new PaymentSystem();
        double originalAmount = 100.0;

        double discountedAmount = paymentSystem.calculateDiscountedAmount(passenger, originalAmount);

        assertEquals(90.0, discountedAmount, 0.01);
    }

    @Test
    public void testCalculateDiscountedAmountPremium() {
        Passenger passenger = new Passenger("Bob", 2, PassengerType.PREMIUM);
        PaymentSystem paymentSystem = new PaymentSystem();
        double originalAmount = 100.0;

        double discountedAmount = paymentSystem.calculateDiscountedAmount(passenger, originalAmount);

        assertEquals(0.0, discountedAmount, 0.01);
    }
}
