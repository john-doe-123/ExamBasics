import java.util.Scanner;

/**
 * Created by pesho on 5/2/2017.
 */
public class Profit {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int workDays = Integer.parseInt(userInput.nextLine());
        double moneyPerDay = Double.parseDouble(userInput.nextLine());
        double usdRate = Double.parseDouble(userInput.nextLine());

        double monthlySalary = workDays * moneyPerDay;
        double yearlyIncome = (monthlySalary * 12) + (monthlySalary * 2.5);
        double netIncomeUSD = yearlyIncome - (yearlyIncome * 0.25);
        double netIncomeBGN = netIncomeUSD * usdRate;
        double avgProfitPerDay = netIncomeBGN / 365;

        System.out.printf("%.2f", avgProfitPerDay);

    }
}
