package loop;

public class TrianglePattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) { // rows
            for (int j = 1; j <= i; j++) { // stars
                System.out.print("* ");
            }
            System.out.println(); // next line
        }
    }

}
