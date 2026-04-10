import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create HashMap to store bogie and capacity
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // ---- ADD bogie-capacity pairs ----
        System.out.println("\nAdding bogie capacity details...");

        bogieCapacityMap.put("Sleeper", 72);        // passenger bogie
        bogieCapacityMap.put("AC Chair", 60);       // passenger bogie
        bogieCapacityMap.put("First Class", 40);    // passenger bogie
        bogieCapacityMap.put("Cargo", 100);         // goods bogie (load capacity)

        // ---- DISPLAY all entries ----
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // ---- FAST LOOKUP ----
        System.out.println("\nChecking capacity of Sleeper bogie...");
        int capacity = bogieCapacityMap.get("Sleeper");
        System.out.println("Sleeper Capacity: " + capacity);

        // Program continues...
    }
}