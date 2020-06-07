// https://leetcode.com/problems/move-zeroes/

class Solution {
    /*
        n: array len
        time: O(n)
        space: O(1)
    */
    public void moveZeroes(int[] nums) {
        int realIndex = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) continue;
            
            nums[realIndex++] = nums[i];
            if(i != realIndex-1) nums[i] = 0;
        }
    }
}
