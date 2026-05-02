public class ex3 {
    public static void main(String[] args) {
        int[] numbers = {5, 20, 40, 8, 16, 87, 100};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;
        System.out.println("Average of all elements: " + average);
    }
}
