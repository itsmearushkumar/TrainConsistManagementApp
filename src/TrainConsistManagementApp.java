import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Reusing PassengerBogie class from UC7
class PassengerBogie {
    String name;
    int capacity;

    PassengerBogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies (same as UC7)
        List<PassengerBogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("First Class", 40));

        // ---- DISPLAY ALL ----
        System.out.println("\nAll Bogies:");
        for (PassengerBogie b : bogies) {
            b.display();
        }

        // ---- STREAM FILTER ----
        List<PassengerBogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)   // condition
                .collect(Collectors.toList());  // collect result

        // ---- DISPLAY FILTERED ----
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (PassengerBogie b : filteredBogies) {
            b.display();
        }

        // Program continues...
    }
}