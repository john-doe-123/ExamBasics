import java.util.Scanner;

/**
 * Created by pesho on 5/30/2017.
 */
public class Stop {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());

        int total = (4 * n) + 3;
        String dots = "";
        String underscores = "";

        //region First row
        System.out.printf("%1$s%2$s%1$s",
                new String(new char[n + 1]).replace('\0', '.'),
                new String(new char[2 * n + 1]).replace('\0', '_')
        );
        System.out.println();
        //endregion


        for (int i = 0; i < n; i++) {

            dots = new String(new char[n - i]).replace('\0', '.');
            underscores = new String(new char[total - (2 * (n - i) + 4)]).replace('\0', '_');

            //region Old
            //            System.out.print(new String(new char[n - i]).replace('\0', '.'));
//            System.out.print("//");
//            System.out.print(new String(new char[total - ( 2 * (n - i) + 4)]).replace('\0', '_'));
//            System.out.print("\\\\");
//            System.out.print(new String(new char[n - i]).replace('\0', '.'));
//            System.out.println();
            //endregion

            System.out.printf("%1$s//%2$s\\\\%1$s%n", dots, underscores);

        }

        System.out.printf("//%1$sSTOP!%1$s\\\\",
                new String(new char[(2 * n - 3)]).replace('\0', '_'));
        System.out.println();


        for (int i = 0; i < n; i++) {

            dots = new String(new char[i]).replace('\0', '.');
            underscores = new String(new char[total - (2 * i + 4)]).replace('\0', '_');

            //region Old
            //            System.out.print(new String(new char[i]).replace('\0', '.'));
//            System.out.print("\\\\");
//            System.out.print(new String(new char[total - (2 * i + 4)]).replace('\0', '_'));
//            System.out.print("//");
//            System.out.print(new String(new char[i]).replace('\0', '.'));
//            System.out.println();
            //endregion

            System.out.printf("%1$s\\\\%2$s//%1$s%n", dots, underscores);

        }
    }
}
