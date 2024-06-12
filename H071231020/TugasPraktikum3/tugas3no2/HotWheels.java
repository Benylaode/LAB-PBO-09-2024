package TugasPraktikum3.Tugas3No2;

public class HotWheels {
    String name;
    double speed, cash;
    int winningAmount;

    // Constructor
    HotWheels() {
    }

    HotWheels(String name, double speed, double cash) {
        this.name = name;
        this.speed = speed;
        this.cash = cash;
    }

    // Method to display the specifications of the car
    public void showSpec() {
        System.out.println("========== Specification ==========");
        System.out.println("Name           : " + this.getName());
        System.out.println("Speed          : " + this.getSpeed());
        System.out.println("Winning Amount : " + this.getWinningAmount());
        System.out.println("Cash           : Rp. " + this.getCash() + "\n");
    }

    // Method to upgrade the car's speed
    public void upgrade(int budget) {
        if (budget > this.getCash()) {
            System.out.printf("%s cannot be upgraded, not enough money...\n", this.getName());
        } else {
            // Calculate speed increase based on budget
            int increaseSpeed = budget / 50000;
            // Increase speed
            this.speed += increaseSpeed;
            // Update cash after upgrade
            this.setCash(this.getCash() - budget + (budget % 50000));
            System.out.printf("Increases the speed of %s by %d...\n", this.getName(), increaseSpeed);
        }
    }

    // Method for a race between this car and an enemy car
    public void raceTo(HotWheels enemy) {
        if (this.getSpeed() > enemy.getSpeed()) {
            // If this car wins
            this.setWinningAmount(getWinningAmount() + 1);
            this.setCash(getCash() + 40000);
            System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", this.getName(), this.getName(), this.getWinningAmount());
        } else if (this.getSpeed() == enemy.getSpeed()) {
            // If it's a draw
            System.out.printf("%s with %s are equally strong! The match ended in a draw...\n", this.getName(), enemy.getName());
        } else {
            // If the enemy car wins
            enemy.setWinningAmount(enemy.getWinningAmount() + 1);
            enemy.setCash(enemy.getCash() + 40000);
            System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", enemy.getName(), enemy.getName(), enemy.getWinningAmount());
        }
    }

    // Getter and Setter methods for attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public int getWinningAmount() {
        return winningAmount;
    }

    public void setWinningAmount(int winningAmount) {
        this.winningAmount = winningAmount;
    }
}
