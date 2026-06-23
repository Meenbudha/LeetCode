class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int ms = Integer.MIN_VALUE;

        for(int num : nums){
            currSum += num;
            ms = currSum > ms ? currSum : ms;
            if(currSum < 0) currSum = 0;
        }
        return ms;
    }
}