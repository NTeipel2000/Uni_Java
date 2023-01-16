import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Spiel spiel = new Spiel();
        Scanner sc = new Scanner(System.in);
        do {
            spiel.generateZeichen();
            spiel.printAktRound();
            System.out.println("Nochmal spielen? (1) ");
        } while (sc.nextInt() == 1);

    }

}
