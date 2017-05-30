import java.util.Scanner;

/**
 * Created by pesho on 5/30/2017.
 */
public class TriangleArea {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int x1 = Integer.parseInt(userInput.nextLine());
        int y1 = Integer.parseInt(userInput.nextLine());
        int x2 = Integer.parseInt(userInput.nextLine());
        int y2 = Integer.parseInt(userInput.nextLine());
        int x3 = Integer.parseInt(userInput.nextLine());
        int y3 = Integer.parseInt(userInput.nextLine());

        int height = y2 - y1;
        int base = x2 - x3;

        System.out.println((height * base) / 2.0);

    }

}
