package condition;

import java.util.Scanner;

public class GradeProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score: ");
        int score = sc.nextInt(); // Input

        if (score >= 90 && score <= 100) { // A
            System.out.println("Grade: A");
        }

        else if (score >= 80) { // B
            System.out.println("Grade: B");

        } else if (score >= 70) { // c
            System.out.println("Grade: C");

        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }

}
