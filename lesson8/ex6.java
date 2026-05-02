import java.util.Scanner;

public class ex6 {
    static void showAll(int[] numbers) {
        System.out.print("All values: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    static boolean isValidIndex(int index, int length) {
        return index >= 0 && index < length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        boolean running = true;

        while (running) {
            System.out.println("\n1. Show");
            System.out.println("2. Update");
            System.out.println("3. Show All");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Please input index: ");
                    int showIndex = sc.nextInt();
                    if (isValidIndex(showIndex, numbers.length)) {
                        System.out.println("Value at index " + showIndex + ": " + numbers[showIndex]);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 2:
                    System.out.print("Please input index: ");
                    int updateIndex = sc.nextInt();
                    if (isValidIndex(updateIndex, numbers.length)) {
                        System.out.print("Please input value: ");
                        int value = sc.nextInt();
                        numbers[updateIndex] = value;
                        System.out.println("Value updated successfully.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 3:
                    showAll(numbers);
                    break;
                case 4:
                    running = false;
                    System.out.println("Program ended.");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }

        sc.close();
    }
}
