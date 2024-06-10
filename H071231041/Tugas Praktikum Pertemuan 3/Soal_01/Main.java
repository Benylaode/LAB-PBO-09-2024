package Soal_01;

public class Main {
    public static void main(String[] args) {
        Monster godzilla = new Monster("Godzilla", 120, 100, 65, 500);
        Monster kong = new Monster("Kong", 150, 90, 100, 450);

        Ability atomic_breath = new Ability("Atomic Breath", 300);
        Ability nuclear = new Ability("Nuclear Pulse", 1000);
        Ability axe = new Ability("Axe", 200);

        godzilla.setAbility(atomic_breath);
        godzilla.addAbilities(nuclear);
        kong.setAbility(axe);

        kong.checkCurrentStatus();
        godzilla.attack(kong);

        System.out.println();
        kong.checkCurrentStatus();

        System.out.println();
        godzilla.useAbility(atomic_breath, kong);
        kong.checkCurrentStatus();

        System.out.println();
        godzilla.checkCurrentStatus();

        System.out.println();
        kong.attack(godzilla);
        godzilla.checkCurrentStatus();

        System.out.println();
        kong.getAbility().specialEffect(godzilla); // using special effect
        kong.useAbility(axe, godzilla);
        godzilla.checkCurrentStatus();

        System.out.println();
        axe.upgradeAbility(100);
        kong.useAbility(axe, godzilla);
        godzilla.checkCurrentStatus();

        System.out.println();
        kong.attack(godzilla);
        godzilla.checkCurrentStatus();

        System.out.println();
        kong.getAbility().specialEffect(godzilla); // Using special effect method from class ability
        godzilla.checkCurrentStatus();

        System.out.println();
        kong.attack(godzilla);
        godzilla.checkCurrentStatus();

        System.out.println();
        kong.checkCurrentStatus();

        System.out.println();
        godzilla.useAbility(nuclear, kong);
        kong.checkCurrentStatus();

        System.out.println();
        axe.upgradeAbility(1000);
        kong.useAbility(axe, godzilla);
        godzilla.checkCurrentStatus();
    }
}
