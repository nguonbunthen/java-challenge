public class ex2 {
    public static void main(String[] args) {
        int[] numbers = {2, 10, 5, 8, 9, 20, 35, 50};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
