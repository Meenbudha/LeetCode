class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int count = 0; 

        int[] prefix = new int[n];
        prefix[0] = (nums[0] == target ? 1 : 0);

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + (nums[i] == target ? 1 : 0);
        }

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int tarCount = prefix[j] - (i > 0 ? prefix[i-1] : 0);
                int len = j - i + 1;
                if(2 * tarCount > len) count++;
            }
        }
        return count;
    }
}