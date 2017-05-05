import java.util.Scanner;

/**
 * Created by pesho on 5/4/2017.
 */
public class Flowers {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int chrysanthemumQuantity = Integer.parseInt(userInput.nextLine());
        int roseQuantity = Integer.parseInt(userInput.nextLine());
        int tulipQuantity = Integer.parseInt(userInput.nextLine());
        String season = userInput.nextLine();
        char isHoliday = userInput.nextLine().charAt(0);

        double chrysanthemumPrice = 0;
        double rosePrice = 0;
        double tulipPrice = 0;
        double totalPrice = 0;
        double discount = 0;
        double finalPrice = 0;
        int totalFlowers = chrysanthemumQuantity + roseQuantity + tulipQuantity;


        switch (season) {
            case ("Spring"):
            case ("Summer"):
                chrysanthemumPrice = 2.00;
                rosePrice = 4.10;
                tulipPrice = 2.50;
                break;
            case ("Autumn"):
            case ("Winter"):
                chrysanthemumPrice = 3.75;
                rosePrice = 4.50;
                tulipPrice = 4.15;
                break;
        }


        totalPrice = chrysanthemumPrice * chrysanthemumQuantity +
                rosePrice * roseQuantity +
                tulipPrice * tulipQuantity;


        if (isHoliday == 'Y'){
            totalPrice += totalPrice * 0.15;
        }


        if (season.equals("Spring") && tulipQuantity > 7) {
            totalPrice -= totalPrice * 0.05;
        }
        if (season.equals("Winter") && roseQuantity >= 10) {
            totalPrice -= totalPrice * 0.10;
        }
        if (totalFlowers > 20) {
            totalPrice -= totalPrice * 0.20;
        }

        totalPrice += 2; // 2 lv for making the bouquet.

        System.out.printf("%.2f", totalPrice);


    }
}
