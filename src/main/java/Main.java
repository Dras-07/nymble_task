public class Main {
    public static void main(String[] args) {
        // Create a travel package
        TravelPackage travelPackage = new TravelPackage("Summer Vacation", 50);

        // Create destinations
        Destination beach = new Destination("Beach");
        Destination mountain = new Destination("Mountain");
        Destination cityTour = new Destination("City Tour");

        // Add activities to destinations
        beach.addActivity("Beach Volleyball", "Enjoy playing volleyball on the beach", 10.0, 20, beach);
        beach.addActivity("Snorkeling", "Explore the underwater world", 30.0, 15, mountain);
        mountain.addActivity("Hiking", "Hike through scenic mountain trails", 20.0, 25, beach);
        mountain.addActivity("Camping", "Camp under the stars", 25.0, 20, mountain);
        cityTour.addActivity("Museum Visit", "Explore historical artifacts", 15.0, 30, cityTour);
        cityTour.addActivity("Guided Walking Tour", "Discover the city's landmarks", 20.0, 25, cityTour);

        // Add destinations to travel package
        travelPackage.addDestination(beach);
        travelPackage.addDestination(mountain);
        travelPackage.addDestination(cityTour);

        // Create passengers
        Passenger alice = new Passenger("Alice", 1, PassengerType.STANDARD);
        Passenger bob = new Passenger("Bob", 2, PassengerType.GOLD);
        Passenger charlie = new Passenger("Charlie", 3, PassengerType.PREMIUM);
        Passenger david = new Passenger("David", 4, PassengerType.STANDARD);
        Passenger emily = new Passenger("Emily", 5, PassengerType.GOLD);
        Passenger frank = new Passenger("Frank", 6, PassengerType.PREMIUM);

        // Set balances for passengers
        alice.setBalance(5000.0);
        bob.setBalance(7000.0);
        charlie.setBalance(10000.0);
        david.setBalance(5500.0);
        emily.setBalance(7500.0);
        frank.setBalance(11000.0);

        // Add passengers to travel package
        travelPackage.addPassenger(alice);
        travelPackage.addPassenger(bob);
        travelPackage.addPassenger(charlie);
        travelPackage.addPassenger(david);
        travelPackage.addPassenger(emily);
        travelPackage.addPassenger(frank);

        // Print passenger details
        alice.printDetails();
        bob.printDetails();
        charlie.printDetails();
        david.printDetails();
        emily.printDetails();
        frank.printDetails();

        // Print itinerary
        travelPackage.printItinerary();

        // Print passenger list
        travelPackage.printPassengerList();

        // Print available activities
        travelPackage.printAvailableActivities();
    }
}
