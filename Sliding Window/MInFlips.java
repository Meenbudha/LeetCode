public class MInFlips {
    public static int minFlip(String s){
        int n = s.length();

        int result = Integer.MAX_VALUE;
        int flip1 = 0;
        int flip2 = 0;

        int i = 0;
        
        for(int j = 0; j < 2 *n; j++){
            char expectedChar1 = (j % 2 == 0 ? '0' : '1');
            char expectedChar2 = (j % 2 == 0 ? '1' : '0');
            if(s.charAt(j % n) != expectedChar1) flip1++;
            if(s.charAt(j % n) != expectedChar2) flip2++;

            if(j - i + 1 > n){
                expectedChar1 = (i % 2 == 0 ? '0' : '1');
                expectedChar2 = (i % 2 == 0 ? '1' : '0');
                if(s.charAt(i % n) != expectedChar1) flip1--;
                if(s.charAt(i % n) != expectedChar2) flip2--;
                i++; 
            }

            if(j - i + 1 == n){
                result = Math.min(result, Math.min(flip1, flip2));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "111000";
        System.out.println(minFlip(s));
    }
}
