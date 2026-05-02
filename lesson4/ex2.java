import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter score: ");
        int score = sc.nextInt();

        if (score >= 50){
            System.out.println( "ជាប់");

        }else{
            System.out.println("ធ្លាក់");

        }
        sc.close();

    }
}
