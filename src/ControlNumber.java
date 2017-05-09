import java.util.Scanner;

/**
 * Created by pesho on 5/9/2017.
 */
public class ControlNumber {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());
        int m = Integer.parseInt(userInput.nextLine());
        int controlNumber = Integer.parseInt(userInput.nextLine());

        int sum = 0;
        int moves = 0;

        mainloop:
        for (int firstNumber = 1; firstNumber <= n; firstNumber++) {


            for (int secondNumber = m; secondNumber >= 1; secondNumber--) {

                sum += (firstNumber * 2 + secondNumber * 3);
                moves++;

                if (sum >= controlNumber) {
                    break mainloop;
                }


            }

        }

        if (sum >= controlNumber) {
            System.out.printf("%d moves%n", moves);
            System.out.printf("Score: %d >= %d", sum, controlNumber);
        } else {
            System.out.printf("%d moves", moves);
        }

    }
}
