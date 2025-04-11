package main.java.ex80;

/* See the exercise: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150 */

public class Solution {
    
    public static int removeDuplicates(int[] nums) {

        if (nums.length <= 2) return nums.length;

        int writeIndex = 2; 

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[writeIndex - 2]) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }

        for (int num : nums) System.out.print(num + ", ");
        return writeIndex;
    }

    public static void main(String[] args) {

        System.out.println("\nCase 1:");
        int[] nums_01 = {1, 1, 1, 2, 2, 3};
        System.out.println("\nk = " + removeDuplicates(nums_01));

        System.out.println("\nCase 2:");
        int[] nums_02 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println("\nk = " + removeDuplicates(nums_02));
    }

}