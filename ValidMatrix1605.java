
class ValidMatrix1605 {
    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rows = rowSum.length;
        int cols = colSum.length;
        int[][] output = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
                output[i][j] = Math.min(rowSum[i], colSum[j]);
                
                rowSum[i] -= output[i][j];
                colSum[j] -= output[i][j];
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] rowSum = {3,8};
        int[] colSum = {4,7};
        int[][] result = restoreMatrix(rowSum, colSum);

        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

