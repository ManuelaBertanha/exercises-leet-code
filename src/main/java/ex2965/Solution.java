package main.java.ex2965;

import java.util.ArrayList;
import java.util.List;

/* See the exercise: https://leetcode.com/problems/find-missing-and-repeated-values/description/ */

class Solution {

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];

        int size = grid.length;
        List<Integer> matrixValues = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrixValues.contains(grid[i][j])) ans[0] = grid[i][j];
                matrixValues.add(grid[i][j]);
            }
        }

        for (int i = 1; i <= matrixValues.size(); i++) {
            if (!matrixValues.contains(i)) {
                ans[1] = i;
                break;
            }          
        }

        return ans;
    }
    
    public static void main(String[] args) {
        
        int[][] gridA = {
            {1, 3},
            {2, 2}
        };

        int[][] gridB = {
            {9, 1, 7},
            {8, 9, 2},
            {3, 4, 6}
        };

        int solutionA[] = findMissingAndRepeatedValues(gridA);
        int solutionB[] = findMissingAndRepeatedValues(gridB);

        System.out.println(
            "[" + solutionA[0] + "," + solutionA[1] + "]" + "\n" +
            "[" + solutionB[0] + "," + solutionB[1] + "]"
        );
        
    }
}