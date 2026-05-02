import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        Integer smallest = null;
        Integer secondSmallest = null;

        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];

            if (smallest == null || current < smallest) {
                if (smallest != null && current != smallest) {
                    secondSmallest = smallest;
                }
                smallest = current;
            } else if (current != smallest && (secondSmallest == null || current < secondSmallest)) {
                secondSmallest = current;
            }
        }

        if (secondSmallest == null) {
            System.out.println("No second smallest distinct number found.");
        } else {
            System.out.println("Second smallest number: " + secondSmallest);
        }

        sc.close();
    }
}
