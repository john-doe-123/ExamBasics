import java.util.Scanner;

/**
 * Created by pesho on 6/1/2017.
 */
public class Rocket {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());

        int width = 3 * n;

        //region Top part
        for (int i = 0; i < n; i++) {

            System.out.printf("%1$s/%2$s\\%1$s%n",
                    new String(new char[(width - 2) / 2 - i]).replace('\0', '.'),
                    new String(new char[2 * i]).replace('\0', ' '));
        }
        //endregion

        //region Between top and middle part
        System.out.printf("%1$s%2$s%1$s%n",
                new String(new char[n / 2]).replace('\0', '.'),
                new String(new char[width - n]).replace('\0', '*'));
        //endregion

        //region Middle part
        for (int i = 0; i < n * 2; i++) {

            System.out.printf("%1$s|%2$s|%1$s%n",
                    new String(new char[n / 2]).replace('\0', '.'),
                    new String(new char[width - (n + 2)]).replace('\0', '\\'));

        }
        //endregion

        //region Bottom part
        for (int i = n / 2; i > 0; i--) {

            System.out.printf("%1$s/%2$s\\%1$s%n",
                    new String(new char[i]).replace('\0', '.'),
                    new String(new char[width - (i * 2) - 2]).replace('\0', '*'));

        }
        //endregion

    }
}
