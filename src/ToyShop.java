import java.util.Scanner;

/**
 * Created by pesho on 5/10/2017.
 */
public class ToyShop {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        Double vacationCost = Double.parseDouble(userInput.nextLine());
        int numPuzzles = Integer.parseInt(userInput.nextLine());
        int numDolls = Integer.parseInt(userInput.nextLine());
        int numTeddyBears = Integer.parseInt(userInput.nextLine());
        int numMinions = Integer.parseInt(userInput.nextLine());
        int numTrucks = Integer.parseInt(userInput.nextLine());

        double puzzlePrice = 2.60;
        double dollPrice = 3;
        double teddyBearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2.00;

        double moneyLeft = 0;

        int totalToys = numPuzzles + numDolls +
                numTeddyBears + numMinions +
                numTrucks;

        double totalMoney = numPuzzles * puzzlePrice +
                numDolls * dollPrice +
                numTeddyBears * teddyBearPrice +
                numMinions * minionPrice +
                numTrucks * truckPrice;

        if (totalToys >= 50) {
            totalMoney -= totalMoney * 0.25;
        }

        totalMoney -= totalMoney * 0.10; // 10% for rent.

        moneyLeft = totalMoney - vacationCost;

        if (totalMoney >= vacationCost) {
            System.out.printf("Yes! %.2f lv left.",
                    moneyLeft);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.",
                    Math.abs(moneyLeft));
        }


    }
}
