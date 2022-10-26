package codecademy;

public class Coffee {

    public static void main(String[] args) {
        int cupsOfCoffee = 1;

        while (cupsOfCoffee <= 100) {
            System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
            cupsOfCoffee++;
        }

        System.out.println("Fry is gone...");
    }
}

// 3 Wishes
//public static void main(String[] args) {
//    int wishes = 0;
//    while (wishes < 3) {
//        System.out.println("Wish granted");
//        wishes++;
//    }
//
//    System.out.println("Done");
//}