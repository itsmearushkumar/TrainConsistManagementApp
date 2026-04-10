import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize HashSet for unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // ---- ADD bogie IDs ----
        System.out.println("\nAdding bogie IDs...");

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // Duplicate (will be ignored)

        // ---- DISPLAY unique bogie IDs ----
        System.out.println("\nUnique Bogie IDs in Train:");

        for (String id : bogieIDs) {
            System.out.println(id);
        }

        // ---- CHECK duplicate behavior ----
        System.out.println("\nChecking if 'BG101' exists...");
        if (bogieIDs.contains("BG101")) {
            System.out.println("BG101 is present in the train.");
        } else {
            System.out.println("BG101 is NOT present.");
        }

        // Program continues...
    }
}