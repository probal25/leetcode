package medium.search_a_2d_matrix;

public class Solution {

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int[][] matrix2 = {{1, 3}};
        int[][] matrix3 = {{1}, {3}};
        int target = 3;

//        System.out.println(searchMatrix(matrix, target));
        System.out.println(searchMatrixUsingBinarySearch(matrix3, target));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] values : matrix) {
            for (int value : values) {
                if (value == target) return true;
            }
        }
        return false;
    }

    private static boolean searchMatrixUsingBinarySearch(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int topRow = 0;
        int bottomRow = rows - 1;
        int midRow = (topRow + bottomRow) / 2;
        while (topRow <= bottomRow) {
            if (matrix[midRow][cols - 1] > target) {
                bottomRow = midRow - 1;
            } else if (matrix[midRow][cols - 1] < target) {
                topRow = midRow + 1;
            } else {
                break;
            }
            midRow = (topRow + bottomRow) / 2;
        }
        if (topRow < bottomRow) return false;

        int[] targetRow = matrix[midRow];

        int low = 0;
        int high = targetRow.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (targetRow[mid] == target) {
                return true;
            } else if (targetRow[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

}
