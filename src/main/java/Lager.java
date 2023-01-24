import java.util.ArrayList;
import java.util.List;

public class Lager {

    private List<Artikel> artikelList;

    /**
     * Constructor
     */
    public Lager() {
        this.artikelList = new ArrayList<>();
    }

    /**
     * Adds the given Artikel to the artikelList attribute
     * @param artikel
     */
    public void addArtikel(Artikel artikel){
        for (Artikel a : artikelList) {
            if (artikel.getArtikelnummer().equalsIgnoreCase(a.getArtikelnummer())) {
                a.setAnzahl(a.getAnzahl() + artikel.getAnzahl());
                return;
            }
        }
        artikelList.add(artikel);
    }

    /**
     * Removes Artikel from List / decrements anzahl
     * @param artikelnummer
     * @param anzahl
     */
    public void removeArtikel(String artikelnummer, int anzahl){
        Artikel a = searchArtikel(artikelnummer);
        if (a == null){
            System.out.println("Artikel nicht vorhanden!");
            return;
        }
        if(a.getAnzahl() > anzahl) a.setAnzahl(a.getAnzahl() - anzahl);
        else if(a.getAnzahl() == anzahl) artikelList.remove(a);
        else System.out.println("Nicht genügend Artikel auf Lager! (Lager: "+ a.getAnzahl() +")");
    }


    /**
     * Search Artikel by Artikelnummer
     * @param artikelnummer
     * @return Artikel
     * @see Artikel
     */
    public Artikel searchArtikel(String artikelnummer){
        for(Artikel a : artikelList){
            if(a.getArtikelnummer().equalsIgnoreCase(artikelnummer))
                return a;
        }
        return null;
    }

    /**
     * toString-Method
     * @return String
     * @see StringBuilder
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(Artikel a : artikelList){
            builder.append(a.toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}
