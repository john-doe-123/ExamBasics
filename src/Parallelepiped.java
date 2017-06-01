import java.util.Scanner;

/**
 * Created by pesho on 6/2/2017.
 */
public class Parallelepiped {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());

        int width = 3 * n + 1;
        int height = 4 * n + 4;


//      First row
        System.out.printf("+%1$s+%2$s%n",
                new String(new char[n - 2]).replace('\0', '~'),
                new String(new char[width - n]).replace('\0', '.'));


        //region Top part
        for (int i = 0; i < n * 2 + 1; i++) {

            System.out.printf("|%1$s\\%2$s\\%3$s%n",
                    new String(new char[i]).replace('\0', '.'),
                    new String(new char[n - 2]).replace('\0', '~'),
                    new String(new char[width - (i + (n - 2) + 3)]).replace('\0', '.'));
        }
        //endregion

        //region Bottom part
        for (int i = 0; i < n * 2 + 1; i++) {

            System.out.printf("%1$s\\%2$s|%3$s|%n",
                    new String(new char[i]).replace('\0', '.'),
                    new String(new char[(width - n) - (i + 1)]).replace('\0', '.'),
                    new String(new char[n - 2]).replace('\0', '~'));
        }
        //endregion


//      Last row
        System.out.printf("%1$s+%2$s+%n",
                new String(new char[width - n]).replace('\0', '.'),
                new String(new char[n - 2]).replace('\0', '~'));
    }
}
