import java.util.Scanner;

/**
 * Created by pesho on 5/8/2017.
 */
public class TrainersSalary {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int numLectures = Integer.parseInt(userInput.nextLine());
        double budget = Double.parseDouble(userInput.nextLine());

        double average = budget / numLectures;

        String lecturerName = "";

        int jelevCount = 0;
        int royalCount = 0;
        int roliCount = 0;
        int trofonCount = 0;
        int sinoCount = 0;
        int othersCount = 0;

        for (int lecture = 0; lecture < numLectures; lecture++) {

            lecturerName = userInput.nextLine();

            switch (lecturerName) {

                case ("Jelev"):
                    jelevCount++;
                    break;
                case ("RoYaL"):
                    royalCount++;
                    break;
                case ("Roli"):
                    roliCount++;
                    break;
                case ("Trofon"):
                    trofonCount++;
                    break;
                case ("Sino"):
                    sinoCount++;
                    break;
                default:
                    othersCount++;
                    break;
            }

        }

        System.out.printf("Jelev salary: %.2f lv%n", average * jelevCount);
        System.out.printf("RoYaL salary: %.2f lv%n", average * royalCount);
        System.out.printf("Roli salary: %.2f lv%n", average * roliCount);
        System.out.printf("Trofon salary: %.2f lv%n", average * trofonCount);
        System.out.printf("Sino salary: %.2f lv%n", average * sinoCount);
        System.out.printf("Others salary: %.2f lv", average * othersCount);
    }
}
