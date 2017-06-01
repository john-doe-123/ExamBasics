import java.util.Scanner;

/**
 * Created by pesho on 6/1/2017.
 */
public class Hourglass {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());

        int width = 2 * n + 1;
        int height = 2 * n + 1;
        char symbol = '\0';


        // First row
        System.out.printf("%s%n", new String(new char[width]).replace('\0', '*'));


        //region Top part
        for (int i = 0; i < n - 1; i++) {

            symbol = i == 0 ? ' ' : '@';

            System.out.printf("%1$s*%2$s*%1$s%n",
                    new String(new char[i + 1]).replace('\0', '.'),
                    new String(new char[width - (2 * (i + 1) + 2)]).replace('\0', symbol));
        }
        //endregion

        // Middle
        System.out.printf("%1$s*%1$s%n", new String(new char[(width - 1) / 2]).replace('\0', '.'));


        //region Bottom part
        for (int i = 0; i < n - 1; i++) {

            symbol = i != (n - 2) ? ' ' : '@';

            System.out.printf("%1$s*%2$s@%2$s*%1$s%n",
                    new String(new char[(n - 1) - i]).replace('\0', '.'),
                    new String(new char[i]).replace('\0', symbol));

        }
        //endregion


        // Last row
        System.out.printf("%s", new String(new char[width]).replace('\0', '*'));

    }
}
