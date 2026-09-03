class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;

        for(int n : nums1){
            if(n % 2 == 1) minOdd = Math.min(minOdd, n);
        }

        for(int x : nums1){
            if(x % 2 == 0 && minOdd != Integer.MAX_VALUE && x < minOdd){
                return false;
            }
        }
        return true;
    }
}