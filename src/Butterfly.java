import java.util.Scanner;

/**
 * Created by pesho on 5/30/2017.
 */
public class Butterfly {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());

        int amountOfSpecks = n - 2;

        String evenWings = String.format("%1$s\\ /%1$s",
                new String(new char[amountOfSpecks]).replace('\0', '*'));

        String oddWings = String.format("%1$s\\ /%1$s",
                new String(new char[amountOfSpecks]).replace('\0', '-'));

        String middle = String.format("%1$s@%1$s",
                new String(new char[n - 1]).replace('\0', ' '));

        String evenWingsSwitch = String.format("%1$s/ \\%1$s",
                new String(new char[amountOfSpecks]).replace('\0', '*'));

        String oddWingsSwitch = String.format("%1$s/ \\%1$s",
                new String(new char[amountOfSpecks]).replace('\0', '-'));


        for (int row = 0; row < 2 * (n - 2) + 1; row++) {

            if (row % 2 == 0) {
                System.out.println(evenWings);
            } else if (row == n - 2) {
                System.out.println(middle);
                evenWings = evenWingsSwitch;
                oddWings = oddWingsSwitch;
            } else {
                System.out.println(oddWings);
            }

        }


    }
}
