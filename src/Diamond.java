import java.util.Scanner;

/**
 * Created by pesho on 4/30/2017.
 */
public class Diamond {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int userNumber = Integer.parseInt(userInput.nextLine());


        // Top of the diamond
        System.out.printf("%1$s%2$s%1$s",
                new String(new char[userNumber]).replace('\0', '.'),
                new String(new char[userNumber * 3]).replace('\0', '*'));
        System.out.println();

        for (int k = userNumber - 1; k > 0 ; k--) {

            System.out.printf("%1$s*%2$s*%1$s",
                    new String(new char[k]).replace('\0', '.'),
                    new String(new char[5 * userNumber - 2 - 2 * k]).replace('\0', '.'));
            System.out.println();

        }

        // Middle of the diamond
        System.out.println(new String(new char[userNumber * 5]).replace('\0', '*'));

        // Bottom of the diamond
        for (int i = 1; i <= userNumber * 2; i++) {

            System.out.printf("%1$s*%2$s*%1$s",
                    new String(new char[i]).replace('\0', '.'),
                    new String(new char[5 * userNumber - 2 - 2 * i]).replace('\0', '.'));
            System.out.println();
        }

    }
}
