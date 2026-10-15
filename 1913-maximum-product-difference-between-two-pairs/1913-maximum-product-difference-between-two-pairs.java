class Solution {
    public int maxProductDifference(int[] nums) {
        int n = nums.length - 1;
        bubble(nums);

        return nums[n] * nums[n - 1] - nums[0] * nums[1];
    }
    public static void bubble(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}