import java.util.Scanner;

/**
 * Created by pesho on 4/29/2017.
 */
public class Harvest {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int squareMetersVineyard = Integer.parseInt(userInput.nextLine());
        double grapePerSquareMeter = Double.parseDouble(userInput.nextLine());
        double litersNeeded = Double.parseDouble(userInput.nextLine());
        int numberOfWorkers = Integer.parseInt(userInput.nextLine());

        double totalGrapes = squareMetersVineyard * grapePerSquareMeter;

        double wine = (totalGrapes / 2.5) * 0.40;
        double wineLeft = wine - litersNeeded;

        if (wine >= litersNeeded) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",
                    Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",
                    Math.ceil(wineLeft), Math.ceil(wineLeft / numberOfWorkers));

        } else if (wine < litersNeeded) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",
                    Math.abs(Math.ceil(wineLeft)));
        }

    }

}
