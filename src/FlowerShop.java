import java.util.Scanner;

/**
 * Created by pesho on 5/3/2017.
 */
public class FlowerShop {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double magnoliaPrice = 3.25;
        double hyacinthPrice = 4.0;
        double rosePrice = 3.50;
        double cactusPrice = 8;

        int magnoliaQuantity = Integer.parseInt(userInput.nextLine());
        int hyacinthQuantity = Integer.parseInt(userInput.nextLine());
        int roseQuantity = Integer.parseInt(userInput.nextLine());
        int cactusQuantity = Integer.parseInt(userInput.nextLine());
        double giftPrice = Double.parseDouble(userInput.nextLine());

        double total = magnoliaPrice * magnoliaQuantity +
                hyacinthPrice * hyacinthQuantity +
                rosePrice * roseQuantity +
                cactusPrice * cactusQuantity;

        double moneyAvailable = total * 0.95; // 5% of the money goes for taxes.
        double moneyLeft = moneyAvailable - giftPrice;

        if (moneyAvailable >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(moneyLeft));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(Math.abs(moneyLeft)));
        }




    }
}
