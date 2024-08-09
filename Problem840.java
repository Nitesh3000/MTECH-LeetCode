
/*
 *A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row, column, and both diagonals all have the same sum.

Given a row x col grid of integers, how many 3 x 3 contiguous magic square subgrids are there?

Note: while a magic square can only contain numbers from 1 to 9, grid may contain numbers up to 15.

 

Example 1:
Input: grid = [[4,3,8,4],[9,5,1,9],[2,7,6,2]]
Output: 1

Example 2:

Input: grid = [[8]]
Output: 0
 */
import java.util.HashSet;
import java.util.Set;

public class Problem840 {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        if (grid.length < 2 || grid[0].length < 2) {
            return 0;
        }
        for (int i = 0; i <= grid.length - 3; i++) {
            for (int j = 0; j <= grid[0].length - 3; j++) {
                if (isMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isMagicSquare(int[][] grid, int i, int j) {
        Set<Integer> set = new HashSet<>();

        for (int k = i; k < i + 3; k++) {
            for (int l = j; l < j + 3; l++) {
                if (grid[k][l] > 9 || grid[k][l] < 1) {
                    return false;
                }
                if (set.contains(grid[k][l])) {
                    return false;
                } else {
                    set.add(grid[k][l]);
                }
            }
        }
        int first = grid[i][j];
        int second = grid[i][j + 1];
        int third = grid[i][j + 2];
        int fourth = grid[i + 1][j];
        int fifth = grid[i + 1][j + 1];
        int sixth = grid[i + 1][j + 2];
        int seventh = grid[i + 2][j];
        int eigth = grid[i + 2][j + 1];
        int ninth = grid[i + 2][j + 2];

        if ((first + second + third == first + fourth + seventh) &&
                (first + fourth + seventh == seventh + eigth + ninth) &&
                (seventh + eigth + ninth == ninth + sixth + third) &&
                (ninth + sixth + third == first + fifth + ninth) &&
                (first + fifth + ninth == third + fifth + seventh)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] grid = { { 7, 6, 2, 2, 4 }, { 4, 4, 9, 2, 10 }, { 9, 7, 8, 3, 10 }, { 8, 1, 9, 7, 5 },
                { 7, 10, 4, 11, 6 } };
        Problem840 problem840 = new Problem840();
        System.out.println(problem840.numMagicSquaresInside(grid));
    }

}
