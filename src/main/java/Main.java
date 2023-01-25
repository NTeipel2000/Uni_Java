public class Main {

    static boolean[][] field = new boolean[4][4];
    public static void main(String[] args) {
        System.out.println("Iterativ:");
        solveIterativ();
        System.out.println("Rekursiv:");
        solveRekursiv(4);
    }

    private static void printField(){
        int c = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(field[i][j]) c++;
            }
        }
        if(c == 4) {
            StringBuilder builder = new StringBuilder();
            for (boolean[] bLine : field) {
                for (boolean b : bLine) {
                    if (b) builder.append("# ");
                    else builder.append("- ");
                }
                builder.append("\n");
            }
            System.out.println(builder.toString());
        }
    }

    public static void solveRekursiv(int n){

    }

    private static void solveIterativ(){
        for(int i = 0; i < 4; i++){
            field[0][i] = true;
            if(i > 0) field[0][i-1] = false;
            if(i == 0) field[0][3] = false;
            if(isSolved()) printField();
            for(int j = 0; j < 4; j++){
                field[1][j] = true;
                if(j > 0) field[1][j-1] = false;
                if(j == 0) field[1][3] = false;
                if(isSolved()) printField();
                for(int k = 0; k < 4; k++){
                    field[2][k] = true;
                    if(k > 0) field[2][k-1] = false;
                    if(k == 0) field[2][3] = false;
                    if(isSolved()) printField();
                    for(int l = 0; l < 4; l++){
                        field[3][l] = true;
                        if(l > 0) field[3][l-1] = false;
                        if(l == 0) field[3][3] = false;
                        if(isSolved()) printField();
                    }
                }
            }
        }
    }

    private static boolean isSolved(){
        if (!checkRows()) return false;
        if (!checkCols()) return false;
        if(!checkDiagonals()) return false;
        return true;
    }

    private static boolean checkRows(){
        for(int i = 0; i < 4; i++){
            int c = 0;
            for(int j = 0; j < 4; j++){
                if(field[i][j]) c++;
            }
            if(c > 1) return false;
        }
        return true;
    }

    private static boolean checkCols(){
        for(int i = 0; i < 4; i++){
            int c = 0;
            for(int j = 0; j < 4; j++){
                if(field[j][i]) c++;
            }
            if(c > 1 ) return false;
        }
        return true;
    }

    private static boolean checkDiagonals(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(field[i][j]){
                    if(!combineDiagonalMethods(i, j)) return false;
                }
            }
        }
        return true;
    }

    private static boolean combineDiagonalMethods(int row, int col){
        if(!checkLeftUp(row, col)) return false;
        if(!checkRightUp(row, col)) return false;
        if(!checkRightDown(row, col)) return false;
        if(!checkLeftDown(row, col)) return false;
        return true;
    }

    private static boolean checkLeftUp(int row, int col){
        for(int i = row-1, j = col -1; i > 0 && j > 0; i--, j--){
            if(field[i][j]) return false;
        }
        return true;
    }

    private static boolean checkRightUp(int row, int col){
        for(int i = row-1, j = col +1; i > 0 && j < 4; i--, j++){
            if(field[i][j]) return false;
        }
        return true;
    }

    private static boolean checkRightDown(int row, int col){
        for(int i = row+1, j = col +1; i < 4 && j < 4; i++, j++){
            if(field[i][j]) return false;
        }
        return true;
    }

    private static boolean checkLeftDown(int row, int col){
        for(int i = row+1, j = col -1; i < 4 && j > 0; i++, j--){
            if(field[i][j]) return false;
        }
        return true;
    }


}
