import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by pesho on 4/29/2017.
 */
public class Money {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.0000000000");

        Scanner userInput = new Scanner(System.in);

        int bitcoins = Integer.parseInt(userInput.nextLine());
        double yuans = Double.parseDouble(userInput.nextLine());
        double commissionRate = Double.parseDouble(userInput.nextLine()) / 100;

        int bitcoinsInLeva = bitcoins * 1168;
        double yuansInDollars = yuans * 0.15;
        double dollarsInLeva = yuansInDollars * 1.76;
        
        double totalInLeva = bitcoinsInLeva + dollarsInLeva;

        double totalInEuro = totalInLeva / 1.95;
        totalInEuro -= totalInEuro * commissionRate;

        System.out.println(df.format(totalInEuro));

    }



}
