import java.util.Scanner;

/**
 * Created by pesho on 6/2/2017.
 */
public class SleepyTom {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int nonWorkingDays = Integer.parseInt(userInput.nextLine());

        int MINUTES_PER_YEAR_NEEDED = 30_000;

        int workingDays = 365 - nonWorkingDays;
        int minutesPlayPerWorkDay = 63;
        int minutesPlayPerNonWorkDay = 127;

        int minutesPerYear = (workingDays * minutesPlayPerWorkDay) + (nonWorkingDays * minutesPlayPerNonWorkDay);

        if (MINUTES_PER_YEAR_NEEDED > minutesPerYear) {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",
                    (MINUTES_PER_YEAR_NEEDED - minutesPerYear) / 60,
                    (MINUTES_PER_YEAR_NEEDED - minutesPerYear) % 60);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",
                    (minutesPerYear - MINUTES_PER_YEAR_NEEDED) / 60,
                    (minutesPerYear - MINUTES_PER_YEAR_NEEDED) % 60);
        }
    }
}
