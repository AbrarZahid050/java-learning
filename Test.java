import basics.ex2.GradeBook;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GradeBook myGradeBook = new GradeBook();

        // input prompt:
        System.out.println("Enter the name of the course:");
        String courseName = input.next();
        input.close();

        myGradeBook.setCrouseName(courseName);
        String output = myGradeBook.getCourseName();
        System.out.printf("-> [main] output -> [%s]\n", output);

        myGradeBook.displayMessage();

    }
}