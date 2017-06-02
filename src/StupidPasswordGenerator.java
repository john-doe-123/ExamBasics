import java.util.Scanner;

/**
 * Created by pesho on 6/2/2017.
 */
public class StupidPasswordGenerator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int firstNumber = Integer.parseInt(userInput.nextLine());
        int secondNumber = Integer.parseInt(userInput.nextLine());

        String password;


        for (int firstSymbol = 1; firstSymbol < firstNumber; firstSymbol++) {

            for (int secondSymbol = 1; secondSymbol < firstNumber; secondSymbol++) {

                for (int thirdSymbol = 97; thirdSymbol < (secondNumber + 97); thirdSymbol++) {

                    for (int fourthSymbol = 97; fourthSymbol < (secondNumber + 97); fourthSymbol++) {

                        for (int fifthSymbol = 1; fifthSymbol <= firstNumber; fifthSymbol++) {

                            if (fifthSymbol > secondSymbol && fifthSymbol > firstSymbol) {

                                password = String.format("%d%d%c%c%d ",
                                        firstSymbol,
                                        secondSymbol,
                                        thirdSymbol,
                                        fourthSymbol,
                                        fifthSymbol);

                                System.out.print(password);
                            }


                        }       
                

                    }

                }

            }

        }


    }
}
