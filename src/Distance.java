import java.util.Scanner;

/**
 * Created by pesho on 5/4/2017.
 */
public class Distance {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double speedKPH = Double.parseDouble(userInput.nextLine());
        int firstTime = Integer.parseInt(userInput.nextLine());
        int secondTime = Integer.parseInt(userInput.nextLine());
        int thirdTime = Integer.parseInt(userInput.nextLine());


        double firstDistanceTraveled = speedKPH * (firstTime / 60.0);
        speedKPH *= 1.10;  // Speed increases 10%
        double secondDistanceTraveled = speedKPH * (secondTime / 60.0);
        speedKPH *= 0.95;
        double thirdDistanceTraveled = speedKPH * (thirdTime / 60.0);

        double totalDistance = firstDistanceTraveled + secondDistanceTraveled + thirdDistanceTraveled;

        System.out.printf("%.2f", totalDistance);
    }
}
