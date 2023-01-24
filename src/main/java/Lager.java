import java.util.ArrayList;
import java.util.List;

public class Lager {

    private List<Artikel> artikelList;

    public Lager() {
        this.artikelList = new ArrayList<>();
    }

    public void addArtikel(Artikel artikel){
        for (Artikel a : artikelList) {
            if (artikel.getArtikelnummer().equalsIgnoreCase(a.getArtikelnummer())) {
                a.setAnzahl(a.getAnzahl() + artikel.getAnzahl());
                return;
            }
        }
        artikelList.add(artikel);
    }

    public void removeArtikel(String artikelnummer, int anzahl){
        Artikel a = searchArtikel(artikelnummer);
        if(a.getAnzahl() > anzahl) a.setAnzahl(a.getAnzahl() - anzahl);
        else if(a.getAnzahl() == anzahl) artikelList.remove(a);
        else System.out.println("Nicht genügend Artikel auf Lager! (Lager: "+ a.getAnzahl() +")");
    }

    public Artikel searchArtikel(String artikelnummer){
        for(Artikel a : artikelList){
            if(a.getArtikelnummer().equalsIgnoreCase(artikelnummer))
                return a;
        }
        return null;
    }

    public List<Artikel> getArtikelList() {
        return artikelList;
    }

    public void setArtikelList(List<Artikel> artikelList) {
        this.artikelList = artikelList;
    }

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
