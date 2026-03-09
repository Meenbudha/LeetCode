public class ButtomUp {
    static int m = 1_000_000_007;

    public static int numStableArray(int one, int zero, int limit){
        int[][][] dp = new int[one + 1][zero + 1][2];

        dp[0][0][1] = 1;
        dp[0][0][0] = 1;

        for(int onesLeft = 0; onesLeft <= one; onesLeft++){
            for(int zeroLeft = 0; zeroLeft <= zero; zeroLeft++){
                if(onesLeft == 0 && zeroLeft == 0) continue;

                int result = 0;
                for(int len = 1; len <= Math.min(onesLeft, limit); len++){
                    result = (result + dp[onesLeft - len][zeroLeft][1]) % m;
                }
                dp[onesLeft][zeroLeft][0] = result;

                result = 0;
                for(int len = 1; len <= Math.min(zeroLeft, limit); len++){
                    result = (result + dp[onesLeft][zeroLeft - len][0]) % m;
                }
                dp[onesLeft][zeroLeft][1] = result;
            }
        }
        int startWithZero = dp[one][zero][0];
        int startWithOne  = dp[one][zero][1];

        return (startWithOne + startWithZero) % m;
    }
    public static void main(String[] args) {
        int one = 3;
        int zero = 3;
        int limit = 2;

        System.out.println(numStableArray(one, zero, limit));
    }
}
