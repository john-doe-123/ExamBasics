import java.util.Scanner;

/**
 * Created by pesho on 5/8/2017.
 */
public class HousePainting {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double houseHeight = Double.parseDouble(userInput.nextLine());
        double sideLength= Double.parseDouble(userInput.nextLine());
        double roofHeight = Double.parseDouble(userInput.nextLine());


        double frontBackSideSurfaceArea = 2 * (houseHeight * houseHeight) - (1.2 * 2);
        double sidesSurfaceArea = 2 * (houseHeight * sideLength) - 2 * (1.5 * 1.5);
        double sidesTotalSurfaceArea = frontBackSideSurfaceArea + sidesSurfaceArea;

        double roofSideSurfaceArea = 2 * (houseHeight * sideLength);
        double roofFrontBackSurfaceArea = 2 * ((houseHeight * roofHeight) / 2);
        double roofSurfaceArea = roofSideSurfaceArea + roofFrontBackSurfaceArea;

        double greenPaint = sidesTotalSurfaceArea / 3.4;
        double redPaint = roofSurfaceArea / 4.3;

        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f", redPaint);

    }
}
