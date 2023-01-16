import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Spiel {

    private List<Zeichen> zeichenList;
    private List<Zeichen> aktZeichenRound;

    public Spiel() {
        this.zeichenList = createZeichenList();
        this.aktZeichenRound = new ArrayList<>();
    }

    private List<Zeichen> createZeichenList(){
        List<Zeichen> zeichen = new ArrayList<>();
        zeichen.add(new Zeichen("Kirsche", 3, 'K'));
        zeichen.add(new Zeichen("7", 7, '7'));
        zeichen.add(new Zeichen("8", 8, '8'));
        zeichen.add(new Zeichen("9", 9, '9'));
        zeichen.add(new Zeichen("10", 10, 'Z'));
        zeichen.add(new Zeichen("Herz", 15, 'H'));
        zeichen.add(new Zeichen("Pik-Add", 20, 'P'));
        return zeichen;
    }

    public void generateZeichen(){
        for(int i = 0; i < 3; i++){
            aktZeichenRound.add(zeichenList.get(new Random().nextInt(zeichenList.size()-1)));
        }
    }

    public void printAktRound(){
        double count = 0;
        for(Zeichen z : aktZeichenRound){
            System.out.print(z.getSymbol() +"\t");
            count += z.getWert();
        }
        if(aktZeichenRound.get(0).getSymbol() == aktZeichenRound.get(1).getSymbol() &&
                aktZeichenRound.get(0).getSymbol() == aktZeichenRound.get(2).getSymbol())
            count *= 1.5;
        System.out.println("\n"+ count);
        aktZeichenRound.clear();
    }

}
