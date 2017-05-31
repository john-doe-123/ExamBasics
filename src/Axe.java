import java.util.Scanner;

/**
 * Created by pesho on 5/31/2017.
 */
public class Axe {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());

        int totalCols = 5 * n;
        int totalRows = n % 2 == 0 ? (2 * n) : (2 * n - 1);
        int handle = (totalRows - n) / 2;
        int lastDashes = 1;


        for (int i = 0; i < n; i++) {


            System.out.printf("%1$s*%2$s*%3$s%n",
                    new String(new char[3 * n]).replace('\0', '-'),
                    new String(new char[i]).replace('\0', '-'),
                    new String(new char[totalCols - (3 * n + 2) - i]).replace('\0', '-'));
        }

        for (int i = 0; i < handle; i++) {

            System.out.printf("%1$s*%2$s*%2$s%n",
                    new String(new char[3 * n]).replace('\0', '*'),
                    new String(new char[n - 1]).replace('\0', '-'));

        }

        for (int i = 0, dashes = n - 1; i < (totalRows - n - handle - 1); i++, dashes += 2) {

            System.out.printf("%1$s*%2$s*%3$s%n",
                    new String(new char[3 * n - i]).replace('\0', '-'),
                    new String(new char[dashes]).replace('\0', '-'),
                    new String(new char[totalCols - ((3 * n - i) + dashes + 2)]).replace('\0', '-')
            );

            lastDashes = totalCols - ((3 * n - i) + dashes + 2) - 1;

        }

        System.out.printf("%1$s%2$s%3$s",
                new String(new char[totalCols - (totalRows - 1 + lastDashes)]).replace('\0', '-'),
                new String(new char[totalRows - 1]).replace('\0', '*'),
                new String(new char[lastDashes]).replace('\0', '-'));

    }
}
