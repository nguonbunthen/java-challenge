import java.util.Scanner;

public class ex12 {
    static String convertToJapanese(String name) {
        String[] englishLetters = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };
        String[] japaneseLetters = {
            "\u30A2", "\u30D6", "\u30AF", "\u30C9", "\u30A8", "\u30D5", "\u30B0", "\u30CF", "\u30A4",
            "\u30B8", "\u30AB", "\u30EB", "\u30E0", "\u30F3", "\u30AA", "\u30D7", "\u30AF", "\u30E9",
            "\u30B9", "\u30C8", "\u30A6", "\u30F4", "\u30EF", "\u30AF\u30B9", "\u30E4", "\u30BA"
        };

        String lowerName = name.toLowerCase();
        StringBuilder convertedName = new StringBuilder();

        for (int i = 0; i < lowerName.length(); i++) {
            String current = String.valueOf(lowerName.charAt(i));

            if (current.equals(" ") || current.equals("-")) {
                convertedName.append(current);
                continue;
            }

            boolean found = false;
            for (int j = 0; j < englishLetters.length; j++) {
                if (englishLetters[j].equals(current)) {
                    convertedName.append(japaneseLetters[j]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                convertedName.append(current);
            }
        }

        return convertedName.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name in English: ");
        String name = sc.nextLine();

        String japaneseName = convertToJapanese(name);
        System.out.println("Japanese style name: " + japaneseName);

        sc.close();
    }
}
