package loop;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary: ");
        String binary = sc.nextLine(); // user input

        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) { // rigth -> left
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power); // add
            }
            power++; // next position

        }
        System.out.println("Decimal: " + decimal);
        sc.close(); // close scanner
    }

}
