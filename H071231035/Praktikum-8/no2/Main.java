package no2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text to Type ||");
        System.out.println("\""+typeRacer.getWordsToType()+"\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Rafa", 60, typeRacer);
        typers[1] = new Typer("Raka", 120, typeRacer);
        typers[2] = new Typer("Rara", 80, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}
