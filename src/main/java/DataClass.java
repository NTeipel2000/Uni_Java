import java.util.Random;

public class DataClass {

    /**
     * Sample Data
     * @param lager
     */
    public static void fillData(Lager lager){
        for(int i = 1; i <= 10; i++){
            Artikel a = new Artikel(Integer.toString(i), "Schraube "+ i);
            a.setAnzahl(new Random().nextInt(100 - 5) + 1);
            lager.addArtikel(a);
        }
    }
}
