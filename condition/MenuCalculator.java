package condition;

import java.util.Scanner;

public class MenuCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1.Add");
            System.out.println("\n2.Subtract");
            System.out.println("\n3.Multiply");
            System.out.println("\n4.Exit");
            System.out.print("Choose : ");

            choice = sc.nextInt(); // user choice

            if (choice >= 1 && choice <= 3) {

                System.out.println("Enter number 1: ");
                int a = sc.nextInt();

                System.out.println("Enter number: ");
                int b = sc.nextInt();

                if (choice == 1)
                    System.out.println("Result =  " + (a + b)); // add
                else if (choice == 2)
                    System.out.println("Result = " + (a - b)); // subtract
                else if (choice == 3)
                    System.out.println("Result" + (a * b)); // multiply
            }
        } while (choice != 4); // repeat until exit

        System.out.println("Program Ended");
        sc.close();

    }

}
