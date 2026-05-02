public class ex5 {
    static class Triangle {
        double side1;
        double side2;
        double side3;

        Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
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
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Area: " + triangle.getArea());
    }
}
