public class ConcatinationBinaryNumber {
    public static int concatBinaryNumber(int n){
        long result = 0;
        int bits = 0;

        for(int i = 1; i <= n; i++){
            if((i & (i - 1)) == 0) bits++;
            result = (result << bits) + i;
            result %= 100000007;
        }
        return (int) result;
    }
    public static void main(String[] args) {
        int n = 3;
        // n = 1 + 2 + 3;
        // bits = 1+ 10 + 11 = 11011 = 27 ans
        System.out.println(concatBinaryNumber(n));
    }
}
