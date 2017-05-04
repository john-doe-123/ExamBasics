import java.util.Scanner;

/**
 * Created by pesho on 4/30/2017.
 */
public class BackToThePast {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(userInput.nextLine());
        int yearToLive = Integer.parseInt(userInput.nextLine());
        int age = 18;
        int numberOfYears = yearToLive - 1800; // 1800 is the year when he got back in time

        String message = "";
        String enoughMoney = "Yes! He will live a carefree life and will have %.2f dollars left.";
        String notEnoughMoney = "He will need %.2f dollars to survive.";


        for (int i = 0; i <= numberOfYears; i++) {
//            System.out.printf("Year %d Age %d Money %.2f %n", 1800 + i, age, inheritedMoney);

            if ((1800 + i) % 2 == 0) {
                inheritedMoney -= 12000;
            } else {
                inheritedMoney -= 12000 + (50 * age);
            }

            age++;

        }

        message = inheritedMoney >= 0 ? enoughMoney : notEnoughMoney;
        System.out.printf(message, Math.abs(inheritedMoney));


    }
}
