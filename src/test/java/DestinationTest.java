// DestinationTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DestinationTest {

    @Test
    public void testDestinationInitialization() {
        Destination destination = new Destination("Beach");
        assertEquals("Beach", destination.getName());
        assertTrue(destination.getActivities().isEmpty());
    }

    @Test
    public void testAddActivityToDestination() {
        Destination destination = new Destination("Beach");
        Activity activity = new Activity("Snorkeling", "Explore the underwater world", 30.0, 15,destination,0);
        destination.addActivity(activity);
        assertFalse(destination.getActivities().isEmpty());
        assertEquals(activity, destination.getActivities().get(0));
    }

}
