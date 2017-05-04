import java.util.Scanner;

/**
 * Created by pesho on 5/3/2017.
 */
public class HousePrice {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double smallestRoomSurfaceArea = Double.parseDouble(userInput.nextLine());
        double kitchenSurfaceArea = Double.parseDouble(userInput.nextLine());
        double pricePerSquareMeter = Double.parseDouble(userInput.nextLine());

        double bathroomSurfaceArea = smallestRoomSurfaceArea * 0.50;   // Half of the smallest room.
        double secondRoomSurfaceArea = smallestRoomSurfaceArea * 1.10; // 10% larger than the smallest room.
        double thirdRoomSurfaceArea = secondRoomSurfaceArea * 1.10;    // 10% larger than the second room.

        double totalSurfaceArea = smallestRoomSurfaceArea + kitchenSurfaceArea + bathroomSurfaceArea +
                secondRoomSurfaceArea + thirdRoomSurfaceArea;

        totalSurfaceArea += totalSurfaceArea * 0.05; // We need to add 5% of the surface area for the corridor.

        double totalCost = totalSurfaceArea * pricePerSquareMeter;

        System.out.printf("%.2f", totalCost);

    }
}
