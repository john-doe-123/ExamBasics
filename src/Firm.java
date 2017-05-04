import java.util.Scanner;

/**
 * Created by pesho on 5/2/2017.
 */
public class Firm {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);


        int hoursNeeded = Integer.parseInt(userInput.nextLine());
        int daysAvailable = Integer.parseInt(userInput.nextLine());
        int workersAvailable = Integer.parseInt(userInput.nextLine());

        String enoughTime = "Yes!%.0f hours left.";
        String notEnoughTime = "Not enough time!%.0f hours needed.";
        String message;

        double daysAfterTraining = daysAvailable - (daysAvailable * 0.10);
        double hoursAvailable = daysAfterTraining * 8;
        double hoursAvailableOvertime = workersAvailable * (daysAvailable * 2);
        double totalHoursAvailable = hoursAvailable + hoursAvailableOvertime;
        totalHoursAvailable = Math.floor(totalHoursAvailable);

        message = totalHoursAvailable >= hoursNeeded ? enoughTime : notEnoughTime;

        System.out.printf(message, Math.abs(totalHoursAvailable - hoursNeeded));


    }
}
