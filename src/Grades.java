import java.util.Scanner;

/**
 * Created by pesho on 5/5/2017.
 */
public class Grades {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(userInput.nextLine());

        int topStudents = 0;
        int between4and499 = 0;
        int between3and399 = 0;
        int failed = 0;

        double averageGrade = 0;
        double totalGrades = 0;

        for (int student = 0; student < numberOfStudents; student++) {

            double currentGrade = Double.parseDouble(userInput.nextLine());

            if (currentGrade >= 5.00) {
                topStudents++;
            } else if (currentGrade >= 4.0){
                between4and499++;
            } else if (currentGrade >= 3.0) {
                between3and399++;
            } else{
                failed++;
            }

            totalGrades += currentGrade;

        }

        averageGrade = totalGrades / numberOfStudents;

        System.out.printf("Top students: %.2f%%%n", (1.0 * topStudents / numberOfStudents) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", (1.0 * between4and499 / numberOfStudents) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", (1.0 * between3and399 / numberOfStudents) * 100);
        System.out.printf("Fail: %.2f%%%n", (1.0 * failed / numberOfStudents) * 100);
        System.out.printf("Average: %.2f", averageGrade);


    }
}
