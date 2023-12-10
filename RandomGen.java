import java.util.Random;

public class RandomGen {

    public static void main(String[] args) {
        Random randGen = new Random();
        System.out.printf("-> [main] random number: %d", randGen.nextInt(2));

    }

}
