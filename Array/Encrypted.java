class Encrypted {
    private static int encrypt(int nums){
        int max = 0;
        int count = 0;
        while(nums > 0){
            int temp = nums%10;
            max = Math.max(max, temp);
            count++;
            nums /= 10;
        }
        if(count == 2) max = 11 * max;
        if(count == 3) max = 111 * max;
        if(count == 4) max = 1111 * max;
        return max;
    }
    public static int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 10){
                sum += nums[i];
            }
            if(nums[i] >= 10){
                sum += encrypt(nums[i]);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {10, 21, 32};
        System.err.println(sumOfEncryptedInt(nums));
    }
}