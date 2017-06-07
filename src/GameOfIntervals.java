import java.util.Scanner;

/**
 * Created by pesho on 5/7/2017.
 */
public class GameOfIntervals {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int amountOfNumbers = Integer.parseInt(userInput.nextLine());

        int zeroToNine = 0;
        int tenToNineteen = 0;
        int twentyToTwentyNine = 0;
        int thirtyToThirtyNine = 0;
        int fortyToFifty = 0;
        int invalidNumbers = 0;

        int totalNumbers = 0;
        double score = 0;


        for (int number = 0; number < amountOfNumbers; number++) {

            int currentNumber = Integer.parseInt(userInput.nextLine());

            if (currentNumber >= 0 && currentNumber < 10) {
                zeroToNine++;
                score += currentNumber * 0.20;
            } else if (currentNumber >= 10 && currentNumber < 20) {
                tenToNineteen++;
                score += currentNumber * 0.30;
            } else if (currentNumber >= 20 && currentNumber < 30) {
                twentyToTwentyNine++;
                score += currentNumber * 0.40;
            } else if (currentNumber >= 30 && currentNumber < 40) {
                thirtyToThirtyNine++;
                score += 50;
            } else if (currentNumber >= 40 && currentNumber <= 50) {
                fortyToFifty++;
                score += 100;
            } else if (currentNumber < 0 || currentNumber > 50) {
                invalidNumbers++;
                score /= 2;
            }

            totalNumbers++;
        }


        System.out.printf("%.2f%n", score);
        System.out.printf("From 0 to 9: %.2f%%%n", (1.0 * zeroToNine / totalNumbers) * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", (1.0 * tenToNineteen / totalNumbers) * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", (1.0 * twentyToTwentyNine / totalNumbers) * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", (1.0 * thirtyToThirtyNine / totalNumbers) * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", (1.0 * fortyToFifty / totalNumbers) * 100);
        System.out.printf("Invalid numbers: %.2f%%", (1.0 * invalidNumbers / totalNumbers) * 100);

    }
}
