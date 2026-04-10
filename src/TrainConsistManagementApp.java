import java.util.LinkedList;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // ---- ADD bogies ----
        System.out.println("\nAdding bogies...");

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Display initial consist
        System.out.println("\nInitial Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        // ---- INSERT Pantry Car at position 2 ----
        System.out.println("\nInserting 'Pantry Car' at position 2...");
        trainConsist.add(2, "Pantry Car");

        // ---- REMOVE first and last bogie ----
        System.out.println("\nRemoving first and last bogies...");
        trainConsist.removeFirst();  // removes Engine
        trainConsist.removeLast();   // removes Guard

        // ---- FINAL DISPLAY ----
        System.out.println("\nFinal Ordered Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}