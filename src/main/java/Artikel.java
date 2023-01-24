public class Artikel {

    private String artikelnummer;
    private String name;
    private int anzahl;

    /**
     * Constructor
     * @param artikelnummer
     * @param name
     */
    public Artikel(String artikelnummer, String name) {
        this.artikelnummer = artikelnummer;
        this.name = name;
    }

    /**
     * Constructor
     * @param artikelnummer
     * @param name
     * @param anzahl
     */
    public Artikel(String artikelnummer, String name, int anzahl) {
        this.artikelnummer = artikelnummer;
        this.name = name;
        this.anzahl = anzahl;
    }

    /**
     * Getter
     * @return Artikelnummer
     */
    public String getArtikelnummer() {
        return artikelnummer;
    }

    /**
     * Getter
     * @return Anzahl
     */
    public int getAnzahl() {
        return anzahl;
    }

    /**
     * Setter
     * @param anzahl
     */
    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    /**
     * toString-Method
     * @return String
     * @see StringBuilder
     */
    @Override
    public String toString() {
        return "Artikel{" +
                "artikelnummer='" + artikelnummer + '\'' +
                ", name='" + name + '\'' +
                ", anzahl=" + anzahl +
                '}';
    }
}
