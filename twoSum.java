/*
 * Two Integer Sum
Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.

Example 1:

Input: 
nums = [3,4,5,6], target = 7

Output: [0,1]
Explanation: nums[0] + nums[1] == 7, so we return [0, 1].

Example 2:

Input: nums = [4,5,6], target = 10

Output: [0,2]
Example 3:

Input: nums = [5,5], target = 10

Output: [0,1]
 */
public class twoSum {
    public static int[] twosum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }

        }
        System.gc();
        return output;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        int target = 8;
        int[] output = twosum(nums, target);
        System.out.println(output[0] + " "+ output[1]);
    }
}
