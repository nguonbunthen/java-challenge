package loop;

public class StarPattern {
    public static void main(String[] args) {

        for (int i = 6; i >= 1; i--) { // number of row
            for (int j = 1; j <= i; j++) { // print *
                System.out.print("* ");

            }
            System.out.println(); // next line

        }
    }
}
