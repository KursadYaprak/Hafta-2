import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] A = {
                {2, 3, 4},
                {5, 6, 4},
        };
        int[][] B = new int[A[0].length][A.length];

        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                B[i][j] = A[j][i];
            }
        }
        for (int[] row : B) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
