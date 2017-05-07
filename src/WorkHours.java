import java.util.Scanner;

/**
 * Created by pesho on 5/7/2017.
 */
public class WorkHours {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int hoursNeeded = Integer.parseInt(userInput.nextLine());
        int workersAvailable = Integer.parseInt(userInput.nextLine());
        int workDaysAvailable = Integer.parseInt(userInput.nextLine());

        int hoursAvailable;
        int penalties = 0;
        int hoursLeft = 0;

        String message;
        String enoughTime = "%d hours left";
        String notEnoughTime = "%d overtime%nPenalties: %d";

        hoursAvailable = workersAvailable *
                workDaysAvailable * 8; // 8 hour days.

        hoursLeft = hoursAvailable - hoursNeeded;

        if (hoursLeft < 0) {
            penalties = workDaysAvailable * Math.abs(hoursLeft);
            message = String.format(notEnoughTime, Math.abs(hoursLeft),
                    penalties);
        } else {
            message = String.format(enoughTime, hoursLeft);
        }

        System.out.printf(message);


    }
}
