import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        Integer largest = null;
        Integer secondLargest = null;

        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];

            if (largest == null || current > largest) {
                if (largest != null && current != largest) {
                    secondLargest = largest;
                }
                largest = current;
            } else if (current != largest && (secondLargest == null || current > secondLargest)) {
                secondLargest = current;
            }
        }

        if (secondLargest == null) {
            System.out.println("No second largest distinct number found.");
        } else {
            System.out.println("Second largest number: " + secondLargest);
        }

        sc.close();
    }
}
