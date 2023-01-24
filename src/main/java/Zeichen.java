public class Zeichen {

    private String name;
    private int wert;
    private char symbol;

    public Zeichen(String name, int wert, char symbol) {
        this.name = name;
        this.wert = wert;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public int getWert() {
        return wert;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Zeichen{" +
                "name='" + name + '\'' +
                ", wert=" + wert +
                ", symbol=" + symbol +
                '}';
    }
}
