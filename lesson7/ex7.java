import java.util.Scanner;

public class ex7 {
    static class Area {
        double length;
        double breadth;

        Area(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        double returnArea() {
            return length * breadth;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        Area rectangle = new Area(length, breadth);
        System.out.println("Area of rectangle: " + rectangle.returnArea());

        sc.close();
    }
}
