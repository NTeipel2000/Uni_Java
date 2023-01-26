import java.util.Arrays;

public class FieldRekursiv {

    static int[] queens;

    public static boolean solveNQueensRekursiv(int n) {
        queens = new int[n];
        Arrays.fill(queens, -1);

        return solveNQueens(queens, 0);
    }

    private static boolean solveNQueens(int[] queens, int row) {
        if (row == queens.length) {
            return true;
        }

        for (int col = 0; col < queens.length; col++) {
            if (isValidPosition(queens, row, col)) {
                queens[row] = col;
                if (solveNQueens(queens, row + 1)) {
                    return true;
                }
                queens[row] = -1;
            }
        }

        return false;
    }

    private static boolean isValidPosition(int[] queens, int row, int col) {
        for (int r = 0; r < row; r++) {
            int c = queens[r];
            if (c == col || Math.abs(c - col) == Math.abs(r - row)) {
                return false;
            }
        }
        return true;
    }

}
