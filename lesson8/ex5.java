public class ex5 {
    public static void main(String[] args) {
        int[] numbers = {5, 20, 40, 8, 16, 87, 100};
        int[] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }

        System.out.print("Reversed array: ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i]);
            if (i < reversed.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
