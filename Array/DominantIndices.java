class DominantIndices {
    public static int Indices(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            int sum = 0;
            for(int j = i+1; j < nums.length; j++){
                sum += nums[j];
            }
            int avg = sum / (nums.length - (i + 1));
            if(nums[i] > avg) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,2};
        System.out.println(Indices(nums));
    }
}