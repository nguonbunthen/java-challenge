package condition;

import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subject: ");
        int n = sc.nextInt(); // subject

        int totalPoints = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grate (A/B/C/F): ");
            char grade = sc.next().charAt(0);

            if (grade == 'A')
            totalPoints += 4;
            else if (grade == 'B')
            totalPoints += 3;
            else if (grade == 'C')
            totalPoints += 2;
            else
            totalPoints += 0; // F

        }
        double gpa = (double) totalPoints / n; // calculate

        System.out.println("GPA = " + gpa);

        sc.close();

    }
}
