class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] suf = new int[2*n];

        for(int i = 0; i < n; i++){
            suf[2*i] = nums[i];
            suf[2*i+1] = nums[n+i];
        }
        return suf;
    }

    public static void print(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.err.print(nums[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] Array = {1,2,3,4,5,6,7,8};
        int n = Array.length/2;
        shuffle(Array, n);
        print(Array);
    }
}