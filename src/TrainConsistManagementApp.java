import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Custom Bogie class
class PassengerBogie {
    String name;
    int capacity;

    // Constructor
    PassengerBogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create list of passenger bogies
        List<PassengerBogie> bogies = new ArrayList<>();

        // ---- ADD bogies ----
        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("First Class", 40));

        // ---- DISPLAY before sorting ----
        System.out.println("\nBefore Sorting:");
        for (PassengerBogie b : bogies) {
            b.display();
        }

        // ---- SORT using Comparator (by capacity) ----
        Collections.sort(bogies, (b1, b2) -> b2.capacity - b1.capacity);

        // ---- DISPLAY after sorting ----
        System.out.println("\nAfter Sorting (Descending by Capacity):");
        for (PassengerBogie b : bogies) {
            b.display();
        }

        // Program continues...
    }
}