import java.util.Scanner;

/**
 * Created by pesho on 5/8/2017.
 */
public class Vacation2 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double budget = Double.parseDouble(userInput.nextLine());
        String season = userInput.nextLine().toLowerCase();

        double price = 0;
        String type = "";
        String location = "";


        if (budget <= 1000) {

            type = "Camp";

            switch (season) {
                case ("summer"):
                    price = budget * 0.65;
                    location = "Alaska";
                    break;
                case ("winter"):
                    price = budget * 0.45;
                    location = "Morocco";
                    break;
            }

        } else if (budget > 1000 && budget <= 3000) {

            type = "Hut";

            switch (season) {
                case ("summer"):
                    location = "Alaska";
                    price = budget * 0.80;
                    break;
                case ("winter"):
                    location = "Morocco";
                    price = budget * 0.60;
                    break;
            }
        } else if (budget > 3000) {

            type = "Hotel";

            switch (season) {
                case ("summer"):
                    location = "Alaska";
                    price = budget * 0.90;
                    break;
                case ("winter"):
                    location = "Morocco";
                    price = budget * 0.90;
                    break;
            }
        }


        System.out.printf("%s - %s - %.2f",
                location, type, price);

    }
}
