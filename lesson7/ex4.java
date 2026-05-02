public class ex4 {
    static class Triangle {
        double side1;
        double side2;
        double side3;

        Triangle() {
            side1 = 3;
            side2 = 4;
            side3 = 5;
        }

        double getPerimeter() {
            return side1 + side2 + side3;
        }

        double getArea() {
            double semiPerimeter = getPerimeter() / 2;
            return Math.sqrt(semiPerimeter * (semiPerimeter - side1)
            * (semiPerimeter - side2) * (semiPerimeter - side3));
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Area: " + triangle.getArea());
    }
}
