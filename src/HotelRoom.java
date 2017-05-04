import java.util.Scanner;

/**
 * Created by pesho on 5/2/2017.
 */
public class HotelRoom {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double apartmentCostDay = 0.0;
        double studioCostDay = 0.0;

        String monthName = userInput.nextLine();
        int numberOfDays = Integer.parseInt(userInput.nextLine());

        if (monthName.equals("May") || monthName.equals("October")) {

            if (numberOfDays > 14) {
                studioCostDay = 50 - (50 * 0.30);
                apartmentCostDay = 65 - (65 * 0.10);
            } else if (numberOfDays > 7) {
                studioCostDay = 50 - (50 * 0.05);
                apartmentCostDay = 65;

            } else {
                studioCostDay = 50;
                apartmentCostDay = 65;
            }
        } else if (monthName.equals("June") || monthName.equals("September")) {

            if (numberOfDays > 14) {
                studioCostDay = 75.20 - (75.20 * 0.20);
                apartmentCostDay = 68.70 - (68.70 * 0.10);
            } else {
                studioCostDay = 75.20;
                apartmentCostDay = 68.70;
            }

        } else if (monthName.equals("July") || monthName.equals("August")) {

            studioCostDay = 76;

            if (numberOfDays > 14) {
                apartmentCostDay = 77 - (77 * 0.10);
            } else {
                apartmentCostDay = 77;
            }


        }

        double apartmentTotalCost = apartmentCostDay * numberOfDays;
        double studioTotalCost = studioCostDay * numberOfDays;

        System.out.printf("Apartment: %.2f lv.%n", apartmentTotalCost);
        System.out.printf("Studio: %.2f lv.", studioTotalCost);
    }
}
