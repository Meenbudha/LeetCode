class FindKthBitBinaryString {
    public static char findKthBit(int n, int k) {
        if(n == 1) return '0';

        int len = (1 << n) - 1; //pow(2, n)

        // If k is in the first half, recurse on the first half
        if(k < Math.ceil(len / 2.0)){
            return findKthBit(n - 1, k);
        }
        // if k is the middle
         else if(k == Math.ceil(len / 2.0)){
            return '1';
         }

        // otherwise , recures on the mirrored second half
         else{
            char ch = findKthBit(n - 1, len - (k - 1)); // handle reversed
            return (ch == '0') ? '1' : '0'; // handle flipped bit
         }
    }
    public static void main(String[] args) {
        int n = 4, k = 11;
        System.out.println(findKthBit(n, k));
    }
}