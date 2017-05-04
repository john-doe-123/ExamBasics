import java.util.Scanner;

/**
 * Created by pesho on 5/2/2017.
 */
public class Fishland {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(userInput.nextLine());
        double spratPrice = Double.parseDouble(userInput.nextLine());

        // Weight in kilograms
        double palamudWeight = Double.parseDouble(userInput.nextLine());
        double horseMackerelWeight = Double.parseDouble(userInput.nextLine());
        int shellfishWeight = Integer.parseInt(userInput.nextLine());

        double palamudTotal = palamudWeight * (mackerelPrice + (mackerelPrice * 0.60));
        double horseMackerelTotal = horseMackerelWeight * (spratPrice + (spratPrice * 0.80));
        double shellfishTotal = shellfishWeight * 7.50;

        double total = palamudTotal + horseMackerelTotal + shellfishTotal;

        System.out.printf("%.2f", total);

    }
}
