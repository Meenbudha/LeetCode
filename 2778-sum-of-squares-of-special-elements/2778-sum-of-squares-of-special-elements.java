class Solution {
    public int sumOfSquares(int[] nums) {
        int ans = 0;
        int n = nums.length;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                ans += Math.pow(nums[i-1], 2);
            }
        }
        return ans;
    }
}