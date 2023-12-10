import java.util.Random;

public class BarChart {
    public static void main(String[] args) {
        Random randNum = new Random();
        int[] frequency = new int[7];

        for (int roll = 1; roll <= 60000000; roll++) {
            frequency[1 + randNum.nextInt(6)] += 1;
        }

        System.out.println("Result:");

        for (int i = 0; i <= frequency.length - 1; i++) {
            System.out.printf("%d : %d", (i), frequency[i]);
            System.out.println();
        }

    }
}
