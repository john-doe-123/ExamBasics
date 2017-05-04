import java.util.Scanner;

/**
 * Created by pesho on 4/29/2017.
 */
public class Exercises {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        //double doubleNum = Double.parseDouble(userInput.nextLine());
        //System.out.println("doubleNum = " + doubleNum);
//
//        String name = userInput.nextLine();
//        System.out.println("Hello, " + name);

        System.out.print("Enter the side of a square >> ");
        double side = Double.parseDouble(userInput.nextLine());
        double area = side * side;
        System.out.println("Area of square is " + area + " square meters.");
        
    }

}
