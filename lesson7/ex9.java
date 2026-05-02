import java.util.Scanner;

public class ex9 {
    static class Complex {
        double real;
        double imaginary;

        Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        Complex add(Complex other) {
            return new Complex(real + other.real, imaginary + other.imaginary);
        }

        Complex subtract(Complex other) {
            return new Complex(real - other.real, imaginary - other.imaginary);
        }

        Complex multiply(Complex other) {
            double newReal = (real * other.real) - (imaginary * other.imaginary);
            double newImaginary = (real * other.imaginary) + (imaginary * other.real);
            return new Complex(newReal, newImaginary);
        }

        @Override
        public String toString() {
            if (imaginary < 0) {
                return real + " - " + Math.abs(imaginary) + "i";
            }
            return real + " + " + imaginary + "i";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first complex number real part: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter first complex number imaginary part: ");
        double imaginary1 = sc.nextDouble();

        System.out.print("Enter second complex number real part: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter second complex number imaginary part: ");
        double imaginary2 = sc.nextDouble();

        Complex number1 = new Complex(real1, imaginary1);
        Complex number2 = new Complex(real2, imaginary2);

        System.out.println("Sum: " + number1.add(number2));
        System.out.println("Difference: " + number1.subtract(number2));
        System.out.println("Product: " + number1.multiply(number2));

        sc.close();
    }
}
