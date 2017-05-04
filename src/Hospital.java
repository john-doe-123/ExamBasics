import java.util.Scanner;

/**
 * Created by pesho on 5/2/2017.
 */
public class Hospital {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int numOfPeriods = Integer.parseInt(userInput.nextLine());
        int numOfDoctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int day = 1; day <= numOfPeriods; day++) {

            int currentPatients = Integer.parseInt(userInput.nextLine());

            if (day % 3 == 0 && untreatedPatients > treatedPatients) {
                numOfDoctors++;
            }

            if (currentPatients >= numOfDoctors) {
                treatedPatients += numOfDoctors;
                untreatedPatients += Math.abs(currentPatients - numOfDoctors);
            } else {
                treatedPatients += currentPatients;
            }


        }

        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);

    }
}
