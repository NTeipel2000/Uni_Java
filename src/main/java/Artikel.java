public class Artikel {

    private String artikelnummer;
    private String name;
    private int anzahl;

    public Artikel(String artikelnummer, String name) {
        this.artikelnummer = artikelnummer;
        this.name = name;
    }

    public String getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(String artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "artikelnummer='" + artikelnummer + '\'' +
                ", name='" + name + '\'' +
                ", anzahl=" + anzahl +
                '}';
    }
}
