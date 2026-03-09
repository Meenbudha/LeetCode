import java.util.Arrays;

public class BinaryStableArray{
    static int m = 1_000_000_007;
    static int[][][] dp = new int[2001][2001][2];

    public static int numStableArrays(int one, int zero, int limit){
        for(int[][] a : dp) for(int[] b : a) Arrays.fill(b, -1);

        int startWithOne = solve(one, zero, 1, limit);
        int startWithZero = solve(one, zero, 0, limit);

        return (startWithOne + startWithZero) % m;
    }
    public static int solve(int onesLeft, int zeroLeft, int lastWasOne, int limit){
        if(onesLeft == 0 && zeroLeft == 0) return 1;

        if(dp[onesLeft][zeroLeft][lastWasOne] != -1){
            return dp[onesLeft][zeroLeft][lastWasOne];
        }
        int result = 0;

        if(lastWasOne == 1){ //Explore 0's
            for(int len = 1; len <= Math.min(zeroLeft, limit); len++){
                result = (result + solve(onesLeft, zeroLeft - len, 0, limit)) % m;
            }
        } else { //Explore 1's
            for(int len = 1; len <= Math.min(onesLeft, limit); len++){
                result = (result + solve(onesLeft - len, zeroLeft, 1, limit)) % m;
            }
        }
        return dp[onesLeft][zeroLeft][lastWasOne] = result;
    }
    public static void main(String[] args){
        int one = 1;
        int zero = 1;
        int limit = 2;
        
        System.out.println(numStableArrays(one, zero, limit));
    }
}