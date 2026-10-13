class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] sq = new long[n];

        for(int i = 0;i < n; i++){
            sq[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(sq);

        long score = 0;
        int mid = n / 2;

        for(int i = 0; i < mid; i++){
            score -= sq[i];
        }

        for(int i = mid; i < n; i++){
            score += sq[i];
        }
        return score;
    }
}