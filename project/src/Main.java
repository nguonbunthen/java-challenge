import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== NBC Exchange Rate System ===");
            System.out.println("1. Show Official Exchange Rate");
            System.out.println("2. Convert USD to KHR");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                showOfficialRate();
                break;

            case 2:
                convertUSD(sc);
                break;

            case 3:
                System.out.println("Exit Program");
                break;

            default:
                System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }

    //  Option 1: Show Official Rate + Date
    public static void showOfficialRate() {
        try {
            String url = "https://www.nbc.gov.kh/english/economic_research/exchange_rate.php";

            Document doc = Jsoup.connect(url).get();
            String text = doc.text();

            String date = "";
            double usdRate = 0;

            //  Extract Date
            if (text.contains("Exchange Rate on")) {
                int start = text.indexOf("Exchange Rate on");
                String sub = text.substring(start, start + 50);

                // Extract only date
                date = sub.replaceAll(".*: ", "").split(" ")[0];
            }

            //  Extract Official Rate
            if (text.contains("KHR / USD")) {
                int index = text.indexOf("KHR / USD");

                String sub = text.substring(index - 10, index);
                sub = sub.replaceAll("[^0-9]", "");

                usdRate = Double.parseDouble(sub);
            }

            //  Output
            System.out.println("\n=== NBC Official Exchange Rate ===");
            System.out.println("Exchange Rate on : " + date);
            System.out.println("Official Exchange Rate : " + usdRate + " KHR / USD");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //  Option 2: Convert USD → KHR
    public static void convertUSD(Scanner sc) {
        try {
            String url = "https://www.nbc.gov.kh/english/economic_research/exchange_rate.php";

            Document doc = Jsoup.connect(url).get();
            String text = doc.text();

            double usdRate = 0;

            //  Extract Official Rate
            if (text.contains("KHR / USD")) {
                int index = text.indexOf("KHR / USD");

                String sub = text.substring(index - 10, index);
                sub = sub.replaceAll("[^0-9]", "");

                usdRate = Double.parseDouble(sub);
            }

            if (usdRate > 0) {
                System.out.print("Enter USD: ");
                double usd = sc.nextDouble();

                double khr = usd * usdRate;

                System.out.println("Official Rate: " + usdRate + " KHR/USD");
                System.out.println("Result: " + usd + " USD = " + khr + " KHR");
            } else {
                System.out.println("USD rate not found!");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
