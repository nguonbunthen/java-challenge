import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ege: ");
        int age = sc.nextInt();

        if (age >= 18 ){
            System.out.println("You're eligble to vote.");

        }else{
            System.out.println("You're not eligile to vote.");
        }
        sc.close();
    
    }
}
