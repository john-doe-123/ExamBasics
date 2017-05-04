import java.util.Scanner;

/**
 * Created by pesho on 5/3/2017.
 */
public class Vacation {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int numAdults = Integer.parseInt(userInput.nextLine());
        int numPupils = Integer.parseInt(userInput.nextLine());
        int numDays = Integer.parseInt(userInput.nextLine());
        String typeOfTransport = userInput.nextLine();

        double trainAdultPrice = 24.99;
        double busAdultPrice = 32.50;
        double boatAdultPrice = 42.99;
        double airplaneAdultPrice = 70;

        double trainPupilPrice = 14.99;
        double busPupilPrice = 28.50;
        double boatPupilPrice = 39.99;
        double airplanePupilPrice = 50.00;

        double costPerNight = 82.99;

        double commission = 0;
        double commissionRate = 0.10;
        double totalCostWithoutCommission = 0;
        double totalTripCost = 0;

        double adultPrice = 0;
        double pupilPrice = 0;

        double adultTotalPrice = 0;
        double pupilTotalPrice = 0;
        double peopleTotalPrice = 0;

        // If the people are >= 50 the discount for train travel is 50%
        double discount = 1.0;

        switch (typeOfTransport) {
            case ("bus"):
                adultPrice = busAdultPrice;
                pupilPrice = busPupilPrice;
                break;
            case ("train"):
                if (numAdults + numPupils >= 50) {
                    discount = 0.50;
                }
                adultPrice = trainAdultPrice;
                pupilPrice = trainPupilPrice;
                break;
            case ("boat"):
                adultPrice = boatAdultPrice;
                pupilPrice = boatPupilPrice;
                break;
            case ("airplane"):
                adultPrice = airplaneAdultPrice;
                pupilPrice = airplanePupilPrice;
                break;
        }

        adultTotalPrice = adultPrice * numAdults;
        pupilTotalPrice = pupilPrice * numPupils;
        // Multiplied by 2 because we need a return ticket too.
        peopleTotalPrice = (adultTotalPrice + pupilTotalPrice) * discount * 2;

        totalCostWithoutCommission = (numDays * costPerNight) +
                peopleTotalPrice;

        commission = totalCostWithoutCommission * commissionRate;
        totalTripCost = totalCostWithoutCommission + commission;

        System.out.printf("%.2f", totalTripCost);
    }
}
