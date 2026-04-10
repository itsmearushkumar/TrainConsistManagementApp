import java.util.LinkedHashSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // ---- ADD bogies ----
        System.out.println("\nAttaching bogies...");

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        System.out.println("\nAttempting to add duplicate bogie 'Sleeper'...");
        trainFormation.add("Sleeper"); // Duplicate (ignored)

        // ---- DISPLAY final formation ----
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");

        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}