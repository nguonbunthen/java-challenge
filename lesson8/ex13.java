import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] firstArray = new int[5];
        int[] secondArray = new int[5];
        int[] resultArray = new int[5];

        System.out.println("Enter 5 elements for the first array:");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            firstArray[i] = sc.nextInt();
        }

        System.out.println("Enter 5 elements for the second array:");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            secondArray[i] = sc.nextInt();
        }

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = firstArray[i] - secondArray[i];
        }

        System.out.print("Result: ");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            if (i < resultArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        sc.close();
    }
}
