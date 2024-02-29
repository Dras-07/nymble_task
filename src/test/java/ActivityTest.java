// ActivityTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ActivityTest {

    @Test
    public void testActivityInitialization() {
        Destination destination = new Destination("mountains");
        Activity activity = new Activity("Hiking", "Hike through scenic mountain trails", 20.0, 25,destination,0);
        assertEquals("Hiking", activity.getName());
        assertEquals("Hike through scenic mountain trails", activity.getDescription());
        assertEquals(20.0, activity.getCost());
        assertEquals(25, activity.getCapacity());
    }
    @Test
    public void testEnrollPassenger() {

        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Test Description", 20.0, 3, destination, 0);

        assertTrue(activity.enrollPassenger());
        assertTrue(activity.enrollPassenger());
        assertTrue(activity.enrollPassenger());

        assertFalse(activity.enrollPassenger());
    }

    @Test
    public void testGetAvailableSpaces() {

        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Test Description", 20.0, 5, destination, 0);
        activity.enrollPassenger();
        activity.enrollPassenger();
        activity.enrollPassenger();

        assertEquals(2, activity.getAvailableSpaces());

        activity.enrollPassenger();
        activity.enrollPassenger();

        assertEquals(0, activity.getAvailableSpaces());
    }
}
