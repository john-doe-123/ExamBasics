import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by pesho on 6/2/2017.
 */
public class FootballLeague {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        NumberFormat numberFormat = NumberFormat.getPercentInstance();
        numberFormat.setMinimumFractionDigits(2);

        int stadiumCapacity = Integer.parseInt(userInput.nextLine());
        double totalFans = Double.parseDouble(userInput.nextLine());

        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        String fanSector;

        for (int fan = 0; fan < totalFans; fan++) {

            fanSector = userInput.nextLine();

            switch (fanSector.toUpperCase()) {
                case ("A"):
                    sectorA++;
                    break;
                case ("B"):
                    sectorB++;
                    break;
                case ("V"):
                    sectorV++;
                    break;
                case ("G"):
                    sectorG++;
                    break;
            }

        }


        System.out.printf("%s%n", numberFormat.format(sectorA / totalFans));
        System.out.printf("%s%n", numberFormat.format(sectorB / totalFans));
        System.out.printf("%s%n", numberFormat.format(sectorV / totalFans));
        System.out.printf("%s%n", numberFormat.format(sectorG / totalFans));
        System.out.printf("%s%n", numberFormat.format(totalFans / stadiumCapacity));


    }
}

