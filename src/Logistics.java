import java.util.Scanner;

/**
 * Created by pesho on 5/4/2017.
 */


public class Logistics {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);


        int numberOfLoads = Integer.parseInt(userInput.nextLine());

        int busTonnes = 0;
        int truckTonnes = 0;
        int trainTonnes = 0;
        int totalTonnes = 0;

        int busPerTonnePrice = 200;
        int truckPerTonnePrice = 175;
        int trainPerTonnePrice = 120;
        int total = 0;


        for (int load = 0; load < numberOfLoads; load++) {

            int currentLoad = Integer.parseInt(userInput.nextLine());

            if (currentLoad < 4) {
                busTonnes += currentLoad;
            } else if (currentLoad >= 4 && currentLoad < 12) {
                truckTonnes += currentLoad;
            } else if (currentLoad >= 12) {
                trainTonnes += currentLoad;
            }

        }

        totalTonnes = busTonnes + truckTonnes + trainTonnes;
        total = (busTonnes * busPerTonnePrice) +
                (truckTonnes * truckPerTonnePrice) +
                (trainTonnes * trainPerTonnePrice);

        double avgTonnePrice = total / (totalTonnes * 1.0);

        System.out.printf("%.2f%n", avgTonnePrice);
        System.out.printf("%.2f%%%n", busTonnes / (totalTonnes * 1.0) * 100);
        System.out.printf("%.2f%%%n", truckTonnes / (totalTonnes * 1.0) * 100);
        System.out.printf("%.2f%%", trainTonnes / (totalTonnes * 1.0) * 100);

    }
}
