import java.util.Scanner;

/**
 * Created by pesho on 5/8/2017.
 */


// Requirements: https://judge.softuni.bg/Contests/Practice/DownloadResource/1939

public class SumTwoNumbers {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int startNumber = Integer.parseInt(userInput.nextLine());
        int endNumber = Integer.parseInt(userInput.nextLine());
        int magicNumber = Integer.parseInt(userInput.nextLine());
        int count = 0;


        String combination = "";

        mainloop:
        for (int firstNumber = startNumber; firstNumber <= endNumber; firstNumber++) {

            for (int secondNumber = startNumber; secondNumber <= endNumber; secondNumber++) {

                if (firstNumber + secondNumber == magicNumber) {

                    count++;
                    combination = String.format("Combination N:%d (%d + %d = %d)",
                            count, firstNumber, secondNumber, magicNumber);
                    break mainloop;
                }

                count++;
            }

        }

        if (combination.equals("")) {
            System.out.printf("%d combinations - neither equals %d",
                    count, magicNumber);
        } else {
            System.out.printf(combination);
        }

    }
}
