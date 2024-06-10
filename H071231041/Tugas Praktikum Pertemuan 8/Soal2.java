
import java.util.Arrays;

class No2 {
    public static void main(String[] args) {
        TypeRacer typeRacer = new TypeRacer();

        typeRacer.setNewWordsToType();
        System.out.println("|| text to Type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Decade", 80, typeRacer);
        typers[1] = new Typer("Zi-O", 72, typeRacer);
        typers[2] = new Typer("Legend", 70, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));
        typeRacer.startRace();
    }
}