import java.util.Scanner;

/**
 * Created by pesho on 6/1/2017.
 */
public class Fox {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());

        int width = 2 * n + 3;
        int middle = n / 3;


        for (int i = 0; i < n; i++) {

            System.out.printf("%1$s\\%2$s/%1$s%n",
                    new String(new char[i + 1]).replace('\0', '*'),
                    new String(new char[width - (2 * (i + 2))]).replace('\0', '-'));

        }

        for (int i = 0; i < middle; i++) {

            System.out.printf("|%1$s\\%2$s/%1$s|%n",
                    new String(new char[((width - (n + 4)) / 2) + i]).replace('\0', '*'),
                    new String(new char[n - (i * 2)]).replace('\0', '*'));
        }

        for (int i = 0; i < n; i++) {

            System.out.printf("%1$s\\%2$s/%1$s%n",
                    new String(new char[i + 1]).replace('\0', '-'),
                    new String(new char[width - 2 * (i + 1) - 2]).replace('\0', '*'));

        }

    }
}
