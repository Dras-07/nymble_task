// package src.main.java;
public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination; 
    private int enrolledCount;


    public Activity(String name, String description, double cost, int capacity, Destination destination,int enrolledCount) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination; 
        this.enrolledCount=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public boolean enrollPassenger() {
        if (enrolledCount < capacity) {
            enrolledCount++;
            return true;
        } else {
            return false;
        }
    }

    public int getAvailableSpaces() {
        return capacity - enrolledCount;
    }
}
