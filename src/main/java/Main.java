import java.util.Scanner;

public class Main {

    static Lager lager = new Lager();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        DataClass.fillData(lager);
        int choice;

        while(true){
            System.out.println("\nArtikel hinzufügen (1)" +
                    "\nArtikel entnehmen (2)" +
                    "\nArtikel suchen (3)" +
                    "\nAusgeben (4)");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    add();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    System.out.println(lager.toString());
                    break;
                default:
                    System.out.println("\nBye Bye");
                    System.exit(0);
            }
        }
    }


    /**
     * Adds a new Artikel to Lager.artikelList
     */
    private static void add(){
        String artNr, name;
        int anzahl;

        System.out.print("\nArtikelnummer: ");
        artNr = sc.next();
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Anzahl: ");
        anzahl = sc.nextInt();

        lager.addArtikel(new Artikel(artNr, name, anzahl));
    }

    /**
     * Removes an Artikel from Lager.artikelList
     */
    private static void remove(){
        String artNr;
        int anzahl;

        System.out.print("\nArtikelnummer: ");
        artNr = sc.next();
        System.out.print("Anzahl: ");
        anzahl = sc.nextInt();

        lager.removeArtikel(artNr, anzahl);
    }

    /**
     * Searches an Artikel in Lager.artikelList
     */
    private static void search(){
        String artNr;

        System.out.print("\nArtiklenummer: ");
        artNr = sc.next();

        Artikel artikel = lager.searchArtikel(artNr);
        if (artikel == null) System.out.println("Artikel nicht vorhanden");
        else System.out.println(artikel.toString());
    }

}
