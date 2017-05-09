import java.util.Scanner;

/**
 * Created by pesho on 5/9/2017.
 */
public class LabRoom {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double width = Double.parseDouble(userInput.nextLine());
        double height = Double.parseDouble(userInput.nextLine());

        double heightInCM = height * 100;
        heightInCM -= 100; // 100 cm needed for corridor.

        int numDesks = (int)(heightInCM / 70);
        double widthInCM = width * 100;
        int numRows = (int)widthInCM / 120;

        int numPlaces = numDesks * numRows - 3;
        System.out.println("numPlaces = " + numPlaces);
    }
}
