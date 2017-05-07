import java.util.Scanner;

/**
 * Created by pesho on 5/7/2017.
 */
public class CarToGo {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double budget = Double.parseDouble(userInput.nextLine());
        String season = userInput.nextLine();

        double rentPrice = 0;
        String carClass = "";
        String carType = "";

        if (budget <= 100) {

            carClass = "Economy class";

            switch (season) {

                case ("Summer"):
                    rentPrice = budget * 0.35;
                    carType = "Cabrio";
                    break;
                case ("Winter"):
                    rentPrice = budget * 0.65;
                    carType = "Jeep";
                    break;
            }
        } else if (budget > 100 && budget <= 500) {

            carClass = "Compact class";

            switch (season) {

                case ("Summer"):
                    rentPrice = budget * 0.45;
                    carType = "Cabrio";
                    break;
                case ("Winter"):
                    rentPrice = budget * 0.80;
                    carType = "Jeep";
                    break;
            }
        } else {

            carClass = "Luxury class";
            rentPrice = budget * 0.90;
            carType = "Jeep";
        }

        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, rentPrice);
    }
}
