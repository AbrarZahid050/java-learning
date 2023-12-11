import Time.Time1;

public class TimeTest {
    public static void main(String[] args) {
        Time1 time = new Time1();

        System.out.print("Initial time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Initial time is: ");
        System.out.println(time.toString());

        System.out.println();

        time.setTime(13, 34, 40);
        System.out.print("Time now is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Time now is: ");
        System.out.println(time.toString());

        try {
            time.setTime(99, 99, 99);
        } catch (IllegalArgumentException err) {
            System.out.printf("Exception: %s\n", err.getMessage());
        }

        System.out.print("Initial time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Initial time is: ");
        System.out.println(time.toString());
    }
}
