class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {

        // Check if all elements can fit
        if (original.length != m * n) {
            return new int[0][0];
        }

        // Create 2D array
        int[][] result = new int[m][n];

        // Put elements into the 2D array
        for (int i = 0; i < original.length; i++) {

            int row = i / n;
            int col = i % n;

            result[row][col] = original[i];
        }

        return result;
    }
}