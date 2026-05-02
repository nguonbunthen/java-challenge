public class ex4 {
    public static void main(String[] args) {
        int[] numbers = {5, 20, 40, 8, 16, 87, 100};
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 87) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("87 exists in the array.");
        } else {
            System.out.println("87 does not exist in the array.");
        }
    }
}
