import java.util.Scanner;

/**
 * Created by pesho on 5/2/2017.
 */
public class StopNumber {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int startNumber = Integer.parseInt(userInput.nextLine());
        int endNumber = Integer.parseInt(userInput.nextLine());
        int stopNumber = Integer.parseInt(userInput.nextLine());
        String numbers = "";


        for (int i = endNumber; i >= startNumber; i--) {

            if (i % 2 == 0 && i % 3 == 0) {

                if (i == stopNumber) {
                    break;
                }

                numbers += i + " ";

            }


        }

        System.out.println(numbers);

    }

}
