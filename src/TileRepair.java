import java.util.Scanner;

/**
 * Created by pesho on 6/2/2017.
 */
public class TileRepair {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int playgroundSide = Integer.parseInt(userInput.nextLine());
        double tileWidth = Double.parseDouble(userInput.nextLine());
        double tileHeight = Double.parseDouble(userInput.nextLine());
        int benchWidth = Integer.parseInt(userInput.nextLine());
        int benchHeight = Integer.parseInt(userInput.nextLine());


        int benchArea = benchHeight * benchWidth;
        int playgroundArea = playgroundSide * playgroundSide;
        playgroundArea -= benchArea;

        double tileArea = tileHeight * tileWidth;

        double tilesNeeded = playgroundArea / tileArea;

        double timeNeeded = tilesNeeded * 0.2; // 1 tile per 0.2 minutes.

        System.out.printf("%.2f%n%.2f",
                tilesNeeded,
                timeNeeded);

    }
}
