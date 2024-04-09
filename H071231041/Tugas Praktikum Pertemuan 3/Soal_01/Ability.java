package Soal_01;

public class Ability {
    String type;
    int damage;

    public Ability() {
    }

    public Ability(String type, int damage) {
        this.type = type;
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void upgradeAbility(int damage) {
        this.damage += damage;
    }

    /*
     * Method special effect yang fungsinya akan membuat defense dari target menjadi
     * 0 ketika digunakan.
     * Akan tetapi untuk menggunakan special effect dari sebuah ability maka darah
     * dari target harus kurang dari 40%.
     */
    public void specialEffect(Monster monster) {
        double fortyPercentOfHP = monster.originHP * 0.4;
        if (monster.getHp() < fortyPercentOfHP) {
            monster.defense = 0;
            System.out.println("Use special effect. Hp target set to 0");
        } else {
            System.out.println("Can't use special effect. The HP target is more than 40%");
        }
    }

}
