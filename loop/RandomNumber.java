package loop;

import java.util.Scanner;
import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        System.out.println("Press Enter to roll dice...");
        sc.nextLine();

        int number = rand.nextInt(6) + 1;
        System.out.println("Result: " + number);

        sc.close();
    }

}
