import java.util.Scanner;

/**
 * Created by pesho on 6/3/2017.
 */
public class MagicCombination {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int magicNumber = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();


        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++) {

                for (int k = 1; k < 10; k++) {

                    for (int l = 1; l < 10; l++) {

                        for (int m = 1; m < 10; m++) {

                            for (int n = 1; n < 10; n++) {

                                if ((i * j * k * l * m * n) == magicNumber) {
                                    sb.append(String.format("%d%d%d%d%d%d ",
                                            i, j, k, l, m, n));
                                }

                            }

                        }

                    }
                }

            }

        }

        System.out.println(sb);

    }
}
