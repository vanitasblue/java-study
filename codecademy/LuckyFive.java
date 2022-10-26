package codecademy;

import java.util.Random;

public class LuckyFive {
//    public static void main(String[] args) {
//        int test = 5;
//        while (test >= 1) {
//            System.out.println(test);
//            test--;
//        }
//    }
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int dieRoll = randomGenerator.nextInt(6) + 1;
        int rollCount = 0;

        while (dieRoll != 5) {
            System.out.println(dieRoll);
            dieRoll = randomGenerator.nextInt(6) + 1;
            rollCount++;
        }

        rollCount++;

        System.out.println("The lucky " + dieRoll + " of " + rollCount + " tries)");
    }
}
