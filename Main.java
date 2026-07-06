import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Arrays to store names and marks
        String[] names = new String[n];
        int[] marks = new int[n];

        // Input student details
        for (int i = 0; i < n; i++) {

            sc.nextLine(); // Clear input buffer

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
        }

        // Display student report
        System.out.println("\n========== STUDENT REPORT ==========");

        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + names[i] + " | Marks: " + marks[i]);
        }

        // Calculate total
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += marks[i];
        }

        // Calculate average
        double average = (double) total / n;

        // Find highest marks
        int highest = marks[0];
        for (int i = 1; i < n; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        // Find lowest marks
        int lowest = marks[0];
        for (int i = 1; i < n; i++) {
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        // Display summary
        System.out.println("\n========== SUMMARY ==========");
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);

        sc.close();
    }
}