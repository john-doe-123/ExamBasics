import java.util.Scanner;

/**
 * Created by pesho on 6/2/2017.
 */
public class Crown {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());

        int width = (2 * n) - 1;


        // First row
        System.out.printf("@%1$s@%1$s@%n", new String(new char[n - 2]).replace('\0', ' '));

        // Second row
        System.out.printf("**%1$s*%1$s**%n", new String(new char[n - 3]).replace('\0', ' '));

        //region Middle
        for (int i = 0; i < n / 2 - 2; i++) {

            System.out.printf("*%1$s*%2$s*%3$s*%2$s*%1$s*%n",
                    new String(new char[i + 1]).replace('\0', '.'),
                    new String(new char[(width - (4 * i + 9)) / 2]).replace('\0', ' '),
                    new String(new char[(i * 2) + 1]).replace('\0', '.'));

        }
        //endregion

        // Before last three rows
        System.out.printf("*%1$s*%2$s*%1$s*%n",
                new String(new char[(n / 2) - 1]).replace('\0', '.'),
                new String(new char[width - (4 + (n - 2))]).replace('\0', '.'));

        // Before last two rows
        System.out.printf("*%1$s%2$s.%2$s%1$s*%n",
                new String(new char[n / 2]).replace('\0', '.'),
                new String(new char[(width - n - 3) / 2]).replace('\0', '*'));

        // Last two rows
        System.out.printf("%1$s%n%1$s",
                new String(new char[width]).replace('\0', '*'));

    }
}
