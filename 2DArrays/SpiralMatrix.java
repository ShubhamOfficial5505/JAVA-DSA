public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
        printSpiralMatrix(arr); // Time complexity = O(n x m)
    }

    public static void printSpiralMatrix(int[][] arr) {
        // Dividing the matrix into four boundaries (top, right, bottom, left)
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;

        // The number of iterations the outer loop would run is controlled by min(n, m) for an n x m matrix
        // For square matrices both control it equally (rows = columns)
        while(startRow <= endRow && startCol <= endCol) {
            // top
            for(int col = startCol; col <= endCol; col++) {
                System.out.println(arr[startRow][col]);
            }

            // right
            for(int row = startRow + 1; row <= endRow; row++) {
                System.out.println(arr[row][endCol]);
            }

            // bottom
            for(int col = endCol - 1; col >= startCol; col--) {
                // This check is redundant for square matrices (loop never runs)
                // Prevent duplication when top boundary = bottom boundary (Happens if row count i.e. n is the minimum and odd)
                // A (1 x k) submatrix is left at the very end, where k > 1
                if(startRow == endRow) {
                    break;
                }

                System.out.println(arr[endRow][col]);
            }

            // left
            for(int row = endRow - 1; row >= startRow + 1; row--) {
                // This check is redundant for square matrices (loop never runs)
                // Prevent duplication when left boundary = right boundary (Happens if column count i.e. m is the minimum and odd)
                // A (k x 1) submatrix is left at the very end, where k > 1
                if(startCol == endCol) {
                    break;
                }

                System.out.println(arr[row][startCol]);
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
}