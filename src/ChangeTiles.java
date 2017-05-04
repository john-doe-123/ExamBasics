import java.util.Scanner;

/**
 * Created by pesho on 5/4/2017.
 */
public class ChangeTiles {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double moneyAvailable = Double.parseDouble(userInput.nextLine());
        double floorWidth = Double.parseDouble(userInput.nextLine());
        double floorLength = Double.parseDouble(userInput.nextLine());
        double tileSide = Double.parseDouble(userInput.nextLine());
        double tileHeight = Double.parseDouble(userInput.nextLine());
        double pricePerTile = Double.parseDouble(userInput.nextLine());
        double labor = Double.parseDouble(userInput.nextLine());

        String message = "";
        String enoughMoney = "%.2f lv left.";
        String notEnoughMoney = "You'll need %.2f lv more.";

        double floorArea = floorWidth * floorLength;
        double tileArea = (tileSide * tileHeight) / 2;
        double tilesNeeded = Math.ceil(floorArea / tileArea + 5);  // 5 more tiles needed in case any of them break.
        double moneyNeeded = (tilesNeeded * pricePerTile) + labor;

        message = moneyAvailable >= moneyNeeded ? enoughMoney : notEnoughMoney;

        System.out.printf(message, Math.abs(moneyAvailable - moneyNeeded));
    }
}
