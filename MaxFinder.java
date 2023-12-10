import java.util.Scanner;

public class MaxFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers for comparison: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        input.close();

        double result = maximum(num1, num2, num3);

        System.out.println("Greatest number is: " + result);

    }

    public static double maximum(double x, double y, double z) {

        return Math.min(x, Math.max(y, z));
    }
}
