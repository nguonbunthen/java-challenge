package loop;

public class PatternLine {
    public static void main(String[] args) {

        System.out.print("["); // start

        for (int i = 1; i <= 10; i++) { // loop
            System.out.print("=*"); // pattern

        }
        System.out.println("=]"); // end
    }
}
