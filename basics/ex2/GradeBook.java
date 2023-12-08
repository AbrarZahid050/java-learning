package basics.ex2;

public class GradeBook {
    private String courseName;

    // constructor:
    public GradeBook(String name) {
        courseName = name;
    }

    public void setCrouseName(String arg) {
        courseName = arg;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage() {
        System.out.printf("The course name is: %s", courseName);
    }
}
