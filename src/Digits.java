import java.util.Scanner;

/**
 * Created by pesho on 5/2/2017.
 */
public class Digits {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int number = Integer.parseInt(userInput.nextLine());

        int firstDigit = number / 100;
        int secondDigit = (number - (firstDigit * 100)) / 10;
        int thirdDigit = (number - (firstDigit * 100)) % 10;

        for (int rows = 0; rows < firstDigit + secondDigit; rows++) {

            for (int columns = 0; columns < firstDigit + thirdDigit; columns++) {

                if (number % 5 == 0) {
                    number -= firstDigit;
                } else if (number % 3 == 0) {
                    number -= secondDigit;
                } else {
                    number += thirdDigit;
                }

                System.out.printf("%d ", number);

            }

            System.out.println();

        }

    }
}
