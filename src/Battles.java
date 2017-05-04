import java.util.Scanner;

/**
 * Created by pesho on 5/3/2017.
 */
public class Battles {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int firstPlayerPokemons = Integer.parseInt(userInput.nextLine());
        int secondPlayerPokemons = Integer.parseInt(userInput.nextLine());

        int numberOfBattles = 0;
        int maxNumberBattles = Integer.parseInt(userInput.nextLine());


        for (int firstPokemon = 1; firstPokemon <= firstPlayerPokemons; firstPokemon++) {


            for (int secondPokemon = 1; secondPokemon <= secondPlayerPokemons ; secondPokemon++) {

                if (numberOfBattles == maxNumberBattles) {
                    break;
                }

                System.out.printf("(%d <-> %d) ", firstPokemon, secondPokemon);
                numberOfBattles++;
            }
            

        }


    }
}
