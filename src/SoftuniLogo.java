import java.util.Scanner;

/**
 * Created by pesho on 6/1/2017.
 */
public class SoftuniLogo {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());

        int width = 12 * n - 5;
        int height = 4 * n - 2;

        char symbol = '\0';

        for (int i = 0; i < 2 * n - 1; i++) {

            System.out.printf("%1$s%2$s%1$s%n",
                    new String(new char[(width - ((6 * i) + 1)) / 2]).replace('\0', '.'),
                    new String(new char[(6 * i) + 1]).replace('\0', '#'));

        }

        System.out.printf("%s%n", new String(new char[width]).replace('\0', '#'));

        for (int i = 0; i < height - (3 * n); i++) {

            System.out.printf("|%1$s%2$s%3$s%n",
                    new String(new char[2 + (3 * i)]).replace('\0', '.'),
                    new String(new char[width - 2 * ((2 + (3 * i)) + 1)]).replace('\0', '#'),
                    new String(new char[(2 + (3 * i)) + 1]).replace('\0', '.'));

        }

        for (int i = 0; i < n; i++) {

            symbol = i != (n - 1) ? '|' : '@';

            System.out.printf("%1$c%2$s%3$s%4$s%n",
                    symbol,
                    new String(new char[((width - (6 * n + 1)) / 2) - 1]).replace('\0', '.'),
                    new String(new char[6 * n + 1]).replace('\0', '#'),
                    new String(new char[(width - (6 * n + 1)) / 2]).replace('\0', '.'));

        }

    }
}
