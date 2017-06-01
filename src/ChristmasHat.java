import java.util.Scanner;

/**
 * Created by pesho on 6/1/2017.
 */
public class ChristmasHat {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());

        int width = 4 * n + 1;
        int height = 2 * n + 5;

        char symbol = '\0';


        //region Top
        System.out.printf("%1$s/|\\%1$s%n",
                new String(new char[(width - 3) / 2]).replace('\0', '.'));

        System.out.printf("%1$s\\|/%1$s%n",
                new String(new char[(width - 3) / 2]).replace('\0', '.'));
        //endregion


        //region Middle
        for (int i = 0; i < n * 2; i++) {

            System.out.printf("%1$s*%2$s*%2$s*%1$s%n",
                    new String(new char[(n * 2 - 1) - i]).replace('\0', '.'),
                    new String(new char[i]).replace('\0', '-'));

        }
        //endregion


        // End of middle
        System.out.printf("%s%n", new String(new char[width]).replace('\0', '*'));



        //region Before last
        for (int i = 0; i < width; i++) {

            symbol = i % 2 == 0 ? '*' : '.';
            System.out.print(symbol);

        }

        System.out.println();
        //endregion

        // End
        System.out.printf("%s%n", new String(new char[width]).replace('\0', '*'));


    }
}
