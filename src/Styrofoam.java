import java.util.Scanner;

/**
 * Created by pesho on 5/9/2017.
 */
public class Styrofoam {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double budget = Double.parseDouble(userInput.nextLine());
        double houseSquareMeters = Double.parseDouble(userInput.nextLine());
        int windowCount = Integer.parseInt(userInput.nextLine());
        double styrofoamPerPack = Double.parseDouble(userInput.nextLine());
        double styrofoamPackPrice = Double.parseDouble(userInput.nextLine());

        double styrofoamPacksNeeded = 0;
        double styrofoamTotalPrice = 0;

        double moneyLeft = 0;


        houseSquareMeters -= windowCount * 2.4;
        houseSquareMeters += houseSquareMeters * 0.10; // Added 10% just in case

        styrofoamPacksNeeded = Math.ceil(houseSquareMeters / styrofoamPerPack);
        styrofoamTotalPrice = styrofoamPacksNeeded * styrofoamPackPrice;

        moneyLeft = budget - styrofoamTotalPrice;

        if (budget >= styrofoamTotalPrice) {
            System.out.printf("Spent: %.2f%n", styrofoamTotalPrice);
            System.out.printf("Left: %.2f", moneyLeft);
        } else {
            System.out.printf("Need more: %.2f", Math.abs(moneyLeft));
        }


    }
}
