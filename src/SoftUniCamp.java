import java.util.Scanner;

/**
 * Created by pesho on 5/3/2017.
 */
public class SoftUniCamp {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int numGroups = Integer.parseInt(userInput.nextLine());

        int studentsCar = 0;
        int studentsMinibus = 0;
        int studentsLittleBus = 0;
        int studentsBus = 0;
        int studentsTrain = 0;
        int totalStudents = 0;


        for (int group = 0; group < numGroups; group++) {

            int numStudents = Integer.parseInt(userInput.nextLine());

            if (numStudents <= 5) {
                studentsCar += numStudents;
            } else if (numStudents > 5 && numStudents <= 12) {
                studentsMinibus += numStudents;
            } else if (numStudents > 12 && numStudents <= 25) {
                studentsLittleBus += numStudents;
            } else if (numStudents > 25 && numStudents <= 40) {
                studentsBus += numStudents;
            } else if (numStudents >= 41){
                studentsTrain += numStudents;
            }

        }

        totalStudents = studentsCar + studentsMinibus +
                studentsLittleBus + studentsBus +
                studentsTrain;

        System.out.printf("%.2f%%%n", studentsCar / (totalStudents * 1.0) * 100);
        System.out.printf("%.2f%%%n", studentsMinibus / (totalStudents * 1.0) * 100);
        System.out.printf("%.2f%%%n", studentsLittleBus / (totalStudents * 1.0) * 100);
        System.out.printf("%.2f%%%n", studentsBus / (totalStudents * 1.0) * 100);
        System.out.printf("%.2f%%", studentsTrain / (totalStudents * 1.0) * 100);

    }
}
