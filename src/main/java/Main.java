public class Main {

    static StringBuilder builder;
    static final int SIZE = 25;

    public static void main(String[] args) {
        System.out.println("Iterative Lösung:");
        if (FieldIterativ.solveNQueensIterativ(SIZE)) {
            System.out.println(printSolutionIterativ());
        }else{
            System.out.println("Keine Lösung gefunden!");
        }

        System.out.println("Rekursive Lösung");
        if(FieldRekursiv.solveNQueensRekursiv(SIZE)){
            System.out.println(printSolutionRekursiv());
        }else{
            System.out.println("Keine Lösung gefunden!");
        }

    }

    public static String printSolutionIterativ() {
        builder = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (FieldIterativ.queens[i] == j) {
                    builder.append("# ");
                } else {
                    builder.append("- ");
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public static String printSolutionRekursiv() {
        builder = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (FieldRekursiv.queens[i] == j) {
                    builder.append("# ");
                } else {
                    builder.append("- ");
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
