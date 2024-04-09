package Soal_01;

import java.util.Vector;

/**
 * Monster
 */
public class Monster {
    String name; // attribute 1
    int attack; // attribute 2
    int defense; // attribute 3
    int battle_iq; // attribute 4
    int hp; // attribute 5
    int originHP;
    Ability ability; // attribute 6
    String currentMethod;
    Vector<String> abilities = new Vector<>();

    public Monster() {
    } // constructor tanpa parameter

    // constructor dengan 1 parameter
    public Monster(String name) {
        this.name = name;
    }

    // constractor dengan 2 parameter
    public Monster(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    // constractor dengan 3 parameter
    public Monster(String name, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    // constractor dengan 4 parameter
    public Monster(String name, int attack, int defense, int battle_iq) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.battle_iq = battle_iq;
    }

    // constractor dengan 5 parameter
    public Monster(String name, int attack, int defense, int battle_iq, int hp) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.battle_iq = battle_iq;
        this.hp = hp;
        this.originHP = hp;
    }

    // constractor dengan 6 parameter
    public Monster(String name, int attack, int defense, int battle_iq, int hp, String abilityType) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.battle_iq = battle_iq;
        this.hp = hp;
        this.originHP = hp;
        this.ability.type = abilityType;
    }

    // Behavior 1 : check status
    public void checkCurrentStatus() {
        if (currentMethod != null) {
            if (getHp() > 0) {
                System.out.println("===== " + getName() + "'s" + " Status (After " + currentMethod + ") =====");
                System.out.println("Name            : " + getName());
                System.out.println("Attack          : " + getAttack());
                System.out.println("Defense         : " + getDefense());
                System.out.println("Battle iq       : " + getBattle_iq());
                System.out.println("Hp              : " + getHp());
                System.out.println("Ability type    : " + getAbilities());
            } else {
                System.out.println("===== " + getName() + "'s" + " Status (After " + currentMethod + ") =====");
                System.out.println(getName() + " is death");

            }
        } else {
            System.out.println("===== " + getName() + "'s" + " Status =====");
            System.out.println("Name            : " + getName());
            System.out.println("Attack          : " + getAttack());
            System.out.println("Defense         : " + getDefense());
            System.out.println("Battle iq       : " + getBattle_iq());
            System.out.println("Hp              : " + getHp());
            System.out.println("Ability type    : " + getAbilities());
        }
    }

    // Behavior 2 : use ability
    public void useAbility(Ability ability, Monster target) {
        if (ability.damage > target.defense) {
            target.hp -= Math.abs((target.defense - ability.damage));
            target.currentMethod = "being attacked by " + ability.getType();
        }
    }

    // Behavior 3 : attack
    public void attack(Monster target) {
        target.hp -= Math.abs((target.defense - getAttack()));

        // Mendapatkan informasi tentang method yang sedang dijalankan
        target.currentMethod = "attacked";
    }

    // Behavior 4 : Add abilities
    public void addAbilities(Ability ability) {
        this.abilities.add(ability.getType() + "(" + ability.getDamage() + ")");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setBattle_iq(int battle_iq) {
        this.battle_iq = battle_iq;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
        addAbilities(ability);
    }

    public Vector<String> getAbilities() {
        return this.abilities;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getBattle_iq() {
        return battle_iq;
    }

    public int getHp() {
        return hp;
    }

    public Ability getAbility() {
        return ability;
    }

}