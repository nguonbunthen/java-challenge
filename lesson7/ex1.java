import java.util.Scanner;

public class ex1 {
    static class Area {
        int length;
        int breadth;

        void setDim(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        int getArea() {
            return length * breadth;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        Area rectangle = new Area();
        rectangle.setDim(length, breadth);

        System.out.println("Area of rectangle: " + rectangle.getArea());
        sc.close();
    }
}
