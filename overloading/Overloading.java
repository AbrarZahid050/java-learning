package overloading;

public class Overloading {
    public static int testMethod(int arg) {
        System.out.printf("-> [Overloading] - [int-testMethod]: %d\n", arg);
        return arg;
    }

    public static double testMethod(double arg) {
        System.out.printf("-> [Overloading] - [double-testMethod]: %.2f\n", arg);
        return arg;
    }
}
