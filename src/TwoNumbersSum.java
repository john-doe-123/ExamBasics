import java.util.Scanner;

/**
 * Created by pesho on 5/8/2017.
 */
public class TwoNumbersSum {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int startNumber = Integer.parseInt(userInput.nextLine());
        int endNumber = Integer.parseInt(userInput.nextLine());
        int magicNumber = Integer.parseInt(userInput.nextLine());

        String message = "";
        int combinationCount = 0;

        mainloop:
        for (int firstNumber = startNumber; firstNumber >= endNumber; firstNumber--) {

            for (int secondNumber = startNumber; secondNumber >= endNumber; secondNumber--) {

                if (firstNumber + secondNumber == magicNumber) {

                    combinationCount++;
                    message = String.format("Combination N:%d (%d + %d = %d)",
                            combinationCount, firstNumber, secondNumber, magicNumber);
                    break mainloop;

                }

                combinationCount++;
            }

        }

        if (message.equals("")) {
            message = String.format("%d combinations - neither equals %d",
                    combinationCount, magicNumber);
        }

        System.out.printf(message);

    }
}

