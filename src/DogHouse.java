import java.util.Scanner;

/**
 * Created by pesho on 5/7/2017.
 */
public class DogHouse {

    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);

        double sideLength = Double.parseDouble(userInput.nextLine());
        double dogHouseHeight = Double.parseDouble(userInput.nextLine());

        double sideSurfaceArea = sideLength * (sideLength / 2);
        double backSideSurfaceArea = ((sideLength / 2) * (sideLength / 2)) +
                ((sideLength / 2) * (dogHouseHeight - (sideLength / 2))) / 2;
        double frontSideSurfaceArea = backSideSurfaceArea -
                ((sideLength / 5) * (sideLength / 5));

        double roofSideSurfaceArea = (sideLength * (sideLength / 2));

        double greenPaint = (sideSurfaceArea * 2) +
                backSideSurfaceArea + frontSideSurfaceArea;

        greenPaint /= 3;   // 1 liter used per 3 square metres.

        double redPaint = roofSideSurfaceArea * 2;
        redPaint /= 5;  // 1 liter used per 5 square metres.

        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f", redPaint);

    }
}
