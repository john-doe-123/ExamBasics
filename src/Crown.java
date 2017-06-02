import java.util.Scanner;

/**
 * Created by pesho on 6/2/2017.
 */
public class Crown {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.nextLine());

        int width = (2 * n) - 1;
        int height = (n  / 2) + 4;


        System.out.printf("@%1$s@%1$s@%n", new String(new char[n - 2]).replace('\0', ' '));
        System.out.printf("**%1$s*%1$s**%n", new String(new char[n - 3]).replace('\0', ' '));

        for (int i = 0; i < n /2 - 2; i++) {

            System.out.printf("*%1$s*%2$s*%3$s*%2$s*%1$s*%n",
                    new String(new char[i + 1]).replace('\0', '.'),
                    "test",
                    new String(new char[(i * 2) + 1]).replace('\0', '.'));


        }
        

    }
}
