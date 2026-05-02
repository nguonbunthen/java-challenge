import java.util.Scanner;

public class ex11 {
    static class AddDistance {
        int feet;
        int inches;

        AddDistance(int feet, int inches) {
            this.feet = feet;
            this.inches = inches;
            normalize();
        }

        void normalize() {
            feet += inches / 12;
            inches %= 12;
        }

        AddDistance add(AddDistance other) {
            return new AddDistance(feet + other.feet, inches + other.inches);
        }

        @Override
        public String toString() {
            return feet + " feet " + inches + " inches";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first distance feet: ");
        int feet1 = sc.nextInt();
        System.out.print("Enter first distance inches: ");
        int inches1 = sc.nextInt();

        System.out.print("Enter second distance feet: ");
        int feet2 = sc.nextInt();
        System.out.print("Enter second distance inches: ");
        int inches2 = sc.nextInt();

        AddDistance distance1 = new AddDistance(feet1, inches1);
        AddDistance distance2 = new AddDistance(feet2, inches2);
        AddDistance total = distance1.add(distance2);

        System.out.println("Total distance: " + total);
        sc.close();
    }
}
