import java.util.Scanner;

/**
 * Created by pesho on 5/10/2017.
 */


public class AlcoholMarket {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(userInput.nextLine());
        double beerLiters = Double.parseDouble(userInput.nextLine());
        double wineLiters = Double.parseDouble(userInput.nextLine());
        double rakiaLiters = Double.parseDouble(userInput.nextLine());
        double whiskeyLiters = Double.parseDouble(userInput.nextLine());

        double rakiaPrice = whiskeyPrice * 0.50;
        double winePrice = rakiaPrice * 0.60;
        double beerPrice = rakiaPrice * 0.20;

        double moneyNeeded = whiskeyPrice * whiskeyLiters +
                rakiaPrice * rakiaLiters +
                winePrice * wineLiters +
                beerPrice * beerLiters;

        System.out.printf("%.2f", moneyNeeded);

    }
}

