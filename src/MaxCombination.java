import java.util.Scanner;

/**
 * Created by pesho on 5/4/2017.
 */
public class MaxCombination {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int firstNumber = Integer.parseInt(userInput.nextLine());
        int secondNumber = Integer.parseInt(userInput.nextLine());
        int stopNumber = Integer.parseInt(userInput.nextLine());

        int numCombinations = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {

            for (int j = firstNumber; j <= secondNumber; j++) {

                if (numCombinations == stopNumber) {
                    break;
                }

                System.out.printf("<%d-%d>", i, j);
                numCombinations ++;
            }
        }

    }
}
