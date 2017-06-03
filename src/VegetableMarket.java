import java.util.Scanner;

/**
 * Created by pesho on 6/3/2017.
 */
public class VegetableMarket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vegPricePerKilo = Double.parseDouble(scanner.nextLine());
        double fruitPricePerKilo = Double.parseDouble(scanner.nextLine());
        int vegKilos = Integer.parseInt(scanner.nextLine());
        int fruitKilos = Integer.parseInt(scanner.nextLine());

        double exchangeRateEURtoBGN = 1.94;

        double total = vegPricePerKilo * vegKilos + fruitPricePerKilo * fruitKilos;

        System.out.printf("%.2f", total / exchangeRateEURtoBGN);

    }
}
