import java.util.Scanner;

/**
 * Created by pesho on 5/2/2017.
 */
public class Pets {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int numDays = Integer.parseInt(userInput.nextLine());
        int foodAvailable = Integer.parseInt(userInput.nextLine());

        double dogFoodNeeded = Double.parseDouble(userInput.nextLine());
        double catFoodNeeded = Double.parseDouble(userInput.nextLine());
        double turtleFoodNeeded = Double.parseDouble(userInput.nextLine());


        double totalFoodNeeded = (dogFoodNeeded * numDays) +
                (catFoodNeeded * numDays) + ((turtleFoodNeeded * numDays) / 1000);


        double foodLeft = Math.abs(foodAvailable - totalFoodNeeded);

        if (foodAvailable >= totalFoodNeeded) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeft));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodLeft));
        }

    }

}
