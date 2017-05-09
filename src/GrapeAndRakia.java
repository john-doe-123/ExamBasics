import java.util.Scanner;

/**
 * Created by pesho on 5/9/2017.
 */
public class GrapeAndRakia {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double squareMeters = Double.parseDouble(userInput.nextLine());
        double grapesPerSquareMeter = Double.parseDouble(userInput.nextLine());
        double waste = Double.parseDouble(userInput.nextLine());

        double grapesTotal = squareMeters * grapesPerSquareMeter;
        grapesTotal -= waste;

        double grapesForRakia = grapesTotal * 0.45;
        double grapesForSale = grapesTotal * 0.55;

        // 7.5kg grapes needed for a liter of rakia
        double rakiaLiters = grapesForRakia / 7.5;

        double rakiaProfit = rakiaLiters * 9.80;
        double grapesProfit = grapesForSale * 1.50;

        System.out.printf("%.2f%n", rakiaProfit);
        System.out.printf("%.2f", grapesProfit);

    }
}
