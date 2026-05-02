public class ex6 {
    static class Rectangle {
        int length;
        int breadth;

        Rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        int Area() {
            return length * breadth;
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(5, 8);

        System.out.println("Area of rectangle 1: " + rectangle1.Area());
        System.out.println("Area of rectangle 2: " + rectangle2.Area());
    }
}
