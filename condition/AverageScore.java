package condition;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of subject: ");
        int n = sc.nextInt(); // subject

        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter score: ");
            int score = sc.nextInt(); // Input
            total += score; // sum
        }

        double avg = (double) total / n; // averrage

        System.out.println("Average: " + avg);

        sc.close();
    }

}
