import java.util.Scanner;

public class ex8 {
    static class Average {
        double calculateAverage(double num1, double num2, double num3) {
            return (num1 + num2 + num3) / 3;
        }

        void printAverage(double num1, double num2, double num3) {
            System.out.println("Average: " + calculateAverage(num1, num2, num3));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Average average = new Average();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        average.printAverage(num1, num2, num3);
        sc.close();
    }
}
