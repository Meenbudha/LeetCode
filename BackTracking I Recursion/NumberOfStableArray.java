public class NumberOfStableArray{
    static int m = 1_000_000_007;

    public static int BinaryStableArray(int one, int zero, int limit){
        int startWithOne = solve(one, zero, true, limit);
        int startWithZero = solve(one, zero, false, limit);

        return (startWithOne + startWithZero) % m;
    }

    public static int solve(int onesLeft, int zeroLeft, boolean lastWasOne, int limit){
        if(onesLeft == 0 && zeroLeft == 0) return 1;

        int result = 0;

        if(lastWasOne){ //Explore 0's
            for(int len = 1; len <= Math.min(zeroLeft, limit); len++){
                result = (result + solve(onesLeft, zeroLeft - len, false, limit)) % m;
            }
        } else { //Explore 1's
            for(int len = 1; len <= Math.min(onesLeft, limit); len++){
                result = (result + solve(onesLeft - len, zeroLeft, true, limit)) % m;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int one = 3;
        int zero = 3;
        int limit = 2;
        
        System.out.println(BinaryStableArray(one, zero, limit));
    }
}