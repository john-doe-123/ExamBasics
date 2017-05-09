import java.util.Scanner;

/**
 * Created by pesho on 5/9/2017.
 */
public class Bills {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int numMonths = Integer.parseInt(userInput.nextLine());

        double electricityBillPerMonth = 0;
        double totalElectricity = 0;

        double waterBill = 20;
        double internetBill = 15;
        double otherBills = 0;
        double totalBill = 0;

        for (int month = 0; month < numMonths; month++) {

            electricityBillPerMonth = Double.parseDouble(userInput.nextLine());
            totalElectricity += electricityBillPerMonth;
            otherBills += (waterBill + internetBill + electricityBillPerMonth) * 1.20;

        }

        totalBill = numMonths * (waterBill + internetBill) +
                totalElectricity + otherBills;


        System.out.printf("Electricity: %.2f lv%n", totalElectricity);
        System.out.printf("Water: %.2f lv%n", numMonths * waterBill);
        System.out.printf("Internet: %.2f lv%n", numMonths * internetBill);
        System.out.printf("Other: %.2f lv%n", otherBills);
        System.out.printf("Average: %.2f lv", totalBill / numMonths);

    }
}
