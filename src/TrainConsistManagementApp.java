import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist (ArrayList)
        List<String> trainConsist = new ArrayList<>();

        // ---- ADD passenger bogies ----
        System.out.println("\nAdding passenger bogies...");

        trainConsist.add("Sleeper Bogie");
        trainConsist.add("AC Chair Bogie");
        trainConsist.add("First Class Bogie");

        // ---- DISPLAY bogies ----
        System.out.println("\nCurrent Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        // ---- REMOVE a bogie ----
        System.out.println("\nRemoving 'AC Chair Bogie'...");
        trainConsist.remove("AC Chair Bogie");

        // Display after removal
        System.out.println("\nTrain Consist after removal:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        // ---- CHECK existence ----
        System.out.println("\nChecking if 'Sleeper Bogie' exists...");
        if (trainConsist.contains("Sleeper Bogie")) {
            System.out.println("Sleeper Bogie is present in the train.");
        } else {
            System.out.println("Sleeper Bogie is NOT present in the train.");
        }

        // Program continues...
    }
}