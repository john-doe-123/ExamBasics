import java.util.Scanner;

/**
 * Created by pesho on 6/2/2017.
 */
public class NumberGenerator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int firstNumber = Integer.parseInt(userInput.nextLine());
        int secondNumber = Integer.parseInt(userInput.nextLine());
        int thirdNumber = Integer.parseInt(userInput.nextLine());
        int specialNumber = Integer.parseInt(userInput.nextLine());
        int controlNumber = Integer.parseInt(userInput.nextLine());

        int sum = 0;

        main:
        for (int j = firstNumber; j > 0; j--) {

            for (int k = secondNumber; k > 0; k--) {

                for (int l = thirdNumber; l > 0; l--) {

                    sum = j * 100 + k * 10 + l;

                    if (sum % 3 == 0) {
                        specialNumber += 5;
                    } else if (sum % 5 == 0) {
                        specialNumber -= 2;
                    } else if (sum % 2 == 0) {
                        specialNumber *= 2;
                    }

                    if (specialNumber >= controlNumber) {
                        break main;
                    }

                }

            }

        }

        if (specialNumber >= controlNumber)

        {
            System.out.printf("Yes! Control number was reached! Current special number is %d.",
                    specialNumber);
        } else

        {
            System.out.printf("No! %d is the last reached special number.",
                    specialNumber);
        }


    }
}
