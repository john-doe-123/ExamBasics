import java.util.Scanner;

/**
 * Created by pesho on 5/8/2017.
 */
public class Cups {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int cupsNeeded = Integer.parseInt(userInput.nextLine());
        int workersAvailable = Integer.parseInt(userInput.nextLine());
        int daysAvailable = Integer.parseInt(userInput.nextLine());
        int cupsLeft = 0;

        // 8 hours per day
        int hoursAvailable = daysAvailable * workersAvailable * 8;
        int cupsMade = hoursAvailable / 5;

        cupsLeft = cupsMade - cupsNeeded;

        if (cupsMade >= cupsNeeded) {
            System.out.printf("%.2f extra money", cupsLeft * 4.20);
        } else {
            System.out.printf("Losses: %.2f", Math.abs(cupsLeft) * 4.20);
        }


    }
}
