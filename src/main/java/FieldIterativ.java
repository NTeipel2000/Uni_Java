import java.util.Arrays;

public class FieldIterativ {

    static int[] queens;

    public static boolean solveNQueensIterativ(int n) {
       queens = new int[n];
        Arrays.fill(queens, -1);

        int row = 0;
        while (row >= 0 && row < n) {
            int col = findValidColumn(queens, row);
            if (col == -1) {
                queens[row] = -1;
                row--;
            } else {
                queens[row] = col;
                row++;
            }
        }
        return queens[n - 1] != -1;
    }

    private static int findValidColumn(int[] queens, int row) {
        int startCol = queens[row] + 1;
        for (int col = startCol; col < queens.length; col++) {
            if (isValidPosition(queens, row, col)) {
                return col;
            }
        }
        return -1;
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
