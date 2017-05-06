import java.util.Scanner;

/**
 * Created by pesho on 5/5/2017.
 */
public class LetterCombinations {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        char startChar = userInput.nextLine().charAt(0);
        char endChar = userInput.nextLine().charAt(0);
        char skipChar = userInput.nextLine().charAt(0);
        StringBuilder sb = new StringBuilder();
        int total = 0;



        for (int i = (int) startChar; i <= (int) endChar; i++) {

            if (i == (int) skipChar) {
                continue;
            }

            for (int j = (int) startChar; j <= (int) endChar; j++) {

                if (j == (int) skipChar) {
                    continue;
                }

                for (int k = (int) startChar; k <= (int) endChar; k++) {

                    if (k == (int) skipChar) {
                        continue;
                    }

                    sb.append((char) i);
                    sb.append((char) j);
                    sb.append((char) k);
                    sb.append(" ");
                    total++;
                }

            }
        }

        System.out.printf("%s%d", sb, total);

    }


}

