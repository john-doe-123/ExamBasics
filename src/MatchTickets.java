import java.util.Scanner;

/**
 * Created by pesho on 4/30/2017.
 */
public class MatchTickets {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double budget = Double.parseDouble(userInput.nextLine());
        String ticketCategory = userInput.nextLine();
        int numberOfPeople = Integer.parseInt(userInput.nextLine());

        double transportCost = 0;
        double budgetLeft;
        double budgetAfterTickets = 0.0;
        double normalTicketPrice = 249.99;
        double vipTicketPrice = 499.99;

        String message = "";
        String enoughMoneyMsg = "Yes! You have %.2f leva left.";
        String notEnoughMoneyMsg = "Not enough money! You need %.2f leva.";


        if (numberOfPeople >= 1 && numberOfPeople < 5) {
            transportCost = 0.75;
        } else if (numberOfPeople >= 5 && numberOfPeople < 10) {
            transportCost = 0.60;
        } else if (numberOfPeople >= 10 && numberOfPeople < 25) {
            transportCost = 0.50;
        } else if (numberOfPeople >= 25 && numberOfPeople < 50) {
            transportCost = 0.40;
        } else if (numberOfPeople >= 50) {
            transportCost = 0.25;
        }

        budgetLeft = budget - (budget * transportCost);


        if (ticketCategory.equals("VIP")) {

            budgetAfterTickets = budgetLeft - (numberOfPeople * vipTicketPrice);
            message = budgetAfterTickets >= 0 ? enoughMoneyMsg : notEnoughMoneyMsg;


        } else if (ticketCategory.equals("Normal")) {

            budgetAfterTickets = budgetLeft - (numberOfPeople * normalTicketPrice);
            message = budgetAfterTickets >= 0 ? enoughMoneyMsg : notEnoughMoneyMsg;

        }

        System.out.printf(message, Math.abs(budgetAfterTickets));

    }
}