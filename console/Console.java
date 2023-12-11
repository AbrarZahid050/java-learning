package console;

public class Console {
    public static void log(Object... args) {
        for (Object params : args) {
            System.out.print(params);
        }
        System.out.println();
    }
}
