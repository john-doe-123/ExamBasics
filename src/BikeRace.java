import java.util.Scanner;

/**
 * Created by pesho on 5/4/2017.
 */

// BikeRace requirements -> https://judge.softuni.bg/Contests/Practice/DownloadResource/1728
// BikeRace Judge        -> https://judge.softuni.bg/Contests/Practice/Index/359#2

public class BikeRace {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int juniorCyclists = Integer.parseInt(userInput.nextLine());
        int seniorCyclists = Integer.parseInt(userInput.nextLine());
        String trailType = userInput.nextLine();

        double juniorsPrice = 0.0;
        double seniorsPrice = 0.0;

        int totalCyclists = juniorCyclists + seniorCyclists;

        switch (trailType) {
            case ("trail"):
                juniorsPrice = 5.50;
                seniorsPrice = 7;
                break;
            case ("cross-country"):
                juniorsPrice = 8;
                seniorsPrice = 9.50;
                break;
            case ("downhill"):
                juniorsPrice = 12.25;
                seniorsPrice = 13.75;
                break;
            case ("road"):
                juniorsPrice = 20;
                seniorsPrice = 21.50;
                break;
        }

        // 25% discount if 50 or more people
        if (totalCyclists >= 50 && trailType.equals("cross-country")) {
            juniorsPrice *= 0.75;
            seniorsPrice *= 0.75;
        }

        double moneyGathered = (juniorCyclists * juniorsPrice) +
                (seniorCyclists * seniorsPrice);

        // 5% of the money go to the organizers.
        double moneyDonated = moneyGathered * 0.95;

        System.out.printf("%.2f", moneyDonated);

    }

}
