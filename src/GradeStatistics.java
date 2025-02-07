import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_GRADES = 10;                     // Total number of grades to read
        double sum = 0.0;
        double average;
        double max = Double.NEGATIVE_INFINITY;         // Initialize max to the smallest possible value
        double min = Double.POSITIVE_INFINITY;         // Initialize min to the largest possible value

        System.out.println("This program will ask for " + NUM_GRADES + " grades and compute the average, maximum, and minimum.");

        // Loop exactly ten times to read grades
        for (int i = 1; i <= NUM_GRADES; i++) {
            double grade = 0.0;
            boolean validInput = false;
            // Prompt until a valid floating-point number is entered
            while (!validInput) {
                System.out.print("Enter grade " + i + ": ");
                if (scanner.hasNextDouble()) {
                    grade = scanner.nextDouble();
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a numeric grade.");
                    scanner.next(); // Consume invalid input to avoid an infinite loop
                }
            }

            // Process the valid grade
            sum += grade;
            if (grade > max) {
                max = grade;
            }
            if (grade < min) {
                min = grade;
            }
        }

        // Calculate average
        average = sum / NUM_GRADES;

        // Display the results formatted to two decimal places
        System.out.println("\n----- Grade Statistics -----");
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Maximum: %.2f\n", max);
        System.out.printf("Minimum: %.2f\n", min);
        System.out.println("----------------------------");

        scanner.close();
    }
}