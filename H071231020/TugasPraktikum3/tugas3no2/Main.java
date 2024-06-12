package TugasPraktikum3.Tugas3No2;

public class Main {
    public static void main(String[] args) {
        // Creating instances of HotWheels with different constructors
        HotWheels mercebesDenz = new HotWheels("Mercebes-Denz", 4, 20000);

        HotWheels ferharri = new HotWheels();
        ferharri.setName("Ferharri");
        ferharri.setSpeed(4);
        ferharri.setCash(50000);

        // Displaying the specifications of both cars
        System.out.println();
        mercebesDenz.showSpec();
        ferharri.showSpec();

        // Printing barriers to separate sections
        printBarriers();    

        // Upgrading both cars
        mercebesDenz.upgrade(50000);
        printBarriers();
        ferharri.upgrade(50000);
        printBarriers();

        // Displaying the specifications of Ferharri after upgrading
        System.out.println();
        ferharri.showSpec();

        // Printing barriers to separate sections
        printBarriers();

        // Simulating races between the cars
        ferharri.raceTo(mercebesDenz);
        printBarriers();
        mercebesDenz.raceTo(ferharri);
        printBarriers();

        // Displaying the specifications of both cars after the race
        System.out.println();
        mercebesDenz.showSpec();
        ferharri.showSpec();
    }

    // Method to print barriers
    public static void printBarriers() {
        System.out.println("================================");
    }
}
