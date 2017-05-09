import java.util.Scanner;

/**
 * Created by pesho on 5/9/2017.
 */
public class TruckDriver {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String season = userInput.nextLine().toLowerCase();
        double kmTraveled = Double.parseDouble(userInput.nextLine());
        double moneyPerMonth = 0;

        switch (season) {

            case ("spring"):
            case ("autumn"):
                if (kmTraveled <= 5000) {
                    moneyPerMonth = kmTraveled * 0.75;
                } else if (kmTraveled > 5000 && kmTraveled <= 10_000) {
                    moneyPerMonth = kmTraveled * 0.95;
                } else if (kmTraveled > 10_000 && kmTraveled <= 20_000) {
                    moneyPerMonth = kmTraveled * 1.45;
                }
                break;
            case ("summer"):
                if (kmTraveled <= 5000) {
                    moneyPerMonth = kmTraveled * 0.90;
                } else if (kmTraveled > 5000 && kmTraveled <= 10_000) {
                    moneyPerMonth = kmTraveled * 1.10;
                } else if (kmTraveled > 10_000 && kmTraveled <= 20_000) {
                    moneyPerMonth = kmTraveled * 1.45;
                }
                break;
            case ("winter"):
                if (kmTraveled <= 5000) {
                    moneyPerMonth = kmTraveled * 1.05;
                } else if (kmTraveled > 5000 && kmTraveled <= 10_000) {
                    moneyPerMonth = kmTraveled * 1.25;
                } else if (kmTraveled > 10_000 && kmTraveled <= 20_000) {
                    moneyPerMonth = kmTraveled * 1.45;
                }
                break;
        }

        moneyPerMonth *= 4;
        moneyPerMonth -= moneyPerMonth * 0.10;  // 10% taxes

        System.out.printf("%.2f", moneyPerMonth);

    }
}
