import java.util.Scanner;

public class StudentAttendance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] names = new String[n];
        boolean[] attendance = new boolean[n];

        // Input student names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i+1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Mark attendance
        for (int i = 0; i < n; i++) {
            System.out.print("Is " + names[i] + " present? (yes/no): ");
            String ans = scanner.nextLine();
            attendance[i] = ans.equalsIgnoreCase("yes");
        }

        // Print attendance report
        System.out.println("\nAttendance Report:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + ": " + (attendance[i] ? "Present" : "Absent"));
        }
    }
}