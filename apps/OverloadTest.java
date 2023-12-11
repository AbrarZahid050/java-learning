import overloading.Overloading;

public class OverloadTest {
    public static void main(String[] arg) {

        System.out.println("-> [main]");
        Overloading.testMethod(10);

        System.out.println("-> [main]");
        Overloading.testMethod(10.7);
    }
}
