import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a: ");
        double a = sc.nextDouble();

        System.out.println("Input b");
        double b = sc.nextDouble();

        System.out.println("Input c: ");
        double c = sc.nextDouble();

        double d = b*b - 4 * a * c;

        if (d > 0 ){
            double x1 = (-b + Math.sqrt(d)) / (2*a);
            double x2 = (-b - Math.sqrt(d)) / (2*a);

            System.out.println("Root: " + x1);
            System.out.println("Root:  " + x2 );

        }
        else if( d == 0){
            double x = -b / (2*a);
            System.out.println( "Root: " + x);
        }else{
            System.out.println( "Not real roots");

        }
        sc.close();

    }

}
