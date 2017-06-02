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

            switch (season.toLowerCase()) {

                case ("summer"):
                    rentPrice = budget * (35 / 100.0);
                    carType = "Cabrio";
                    break;
                case ("winter"):
                    rentPrice = budget * (65 / 100.0);
                    carType = "Jeep";
                    break;
            }
        } else if (budget > 100 && budget <= 500) {

            carClass = "Compact class";

            switch (season.toLowerCase()) {

                case ("summer"):
                    rentPrice = budget * (45 / 100.0);
                    carType = "Cabrio";
                    break;
                case ("winter"):
                    rentPrice = budget * (80 / 100.0);
                    carType = "Jeep";
                    break;
            }
        } else if (budget > 500){

            carClass = "Luxury class";
            rentPrice = budget * (90 / 100.0);
            carType = "Jeep";
        }

        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, rentPrice);
    }
}
