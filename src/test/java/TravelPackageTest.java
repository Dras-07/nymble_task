// TravelPackageTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TravelPackageTest {

    @Test
    public void testTravelPackageInitialization() {
        TravelPackage travelPackage = new TravelPackage("Summer Vacation", 50);
        assertEquals("Summer Vacation", travelPackage.getName());
        assertEquals(50, travelPackage.getPassengerCapacity());
        assertTrue(travelPackage.getItinerary().isEmpty());
        assertTrue(travelPackage.getPassengers().isEmpty());
    }

    @Test
    public void testAddDestinationToTravelPackage() {
        TravelPackage travelPackage = new TravelPackage("Summer Vacation", 50);
        Destination destination = new Destination("Beach");
        travelPackage.addDestination(destination);
        assertFalse(travelPackage.getItinerary().isEmpty());
        assertEquals(destination, travelPackage.getItinerary().get(0));
    }

    @Test
    public void testAddPassengerToTravelPackage() {
        TravelPackage travelPackage = new TravelPackage("Summer Vacation", 2);
        Passenger passenger1 = new Passenger("Alice", 1, PassengerType.STANDARD);
        Passenger passenger2 = new Passenger("Bob", 2, PassengerType.GOLD);
        Passenger passenger3 = new Passenger("Charlie", 3, PassengerType.PREMIUM);
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        travelPackage.addPassenger(passenger3);
        assertEquals(2, travelPackage.getPassengers().size());
    }

    @Test
    public void testAddPassengerUnderCapacity() {
        TravelPackage travelPackage = new TravelPackage("Summer Vacation", 50);
        Passenger passenger = new Passenger("Alice", 1, PassengerType.STANDARD);

        travelPackage.addPassenger(passenger);

        assertTrue(travelPackage.getPassengers().contains(passenger));
    }

    @Test
    public void testAddPassengerOverCapacity() {
        TravelPackage travelPackage = new TravelPackage("Summer Vacation", 1);
        Passenger passenger1 = new Passenger("Alice", 1, PassengerType.STANDARD);
        Passenger passenger2 = new Passenger("Bob", 2, PassengerType.STANDARD);

        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);

        assertFalse(travelPackage.getPassengers().contains(passenger2));
    }

}


