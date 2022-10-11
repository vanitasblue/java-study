package payroll;

public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public Reservation(int count, int capacity, boolean open) {
        if (count < 1 || count > 8) {
            System.out.println("Invalid Reservation: !" + this);
        }
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }

    public void confirmReservation() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser() {
        if (!isConfirmed) {
            System.out.println("Unable to confirm reservation, please contact restaurant.");
        } else {
            System.out.println("Please enjoy your meal!");
        }
    }

    public static void main(String[] arg) {
        Reservation reservation1 = new Reservation(3, 5, true);
        Reservation reservation2 = new Reservation(12, 8, true);
        reservation1.confirmReservation();
        reservation2.confirmReservation();

    }
}
