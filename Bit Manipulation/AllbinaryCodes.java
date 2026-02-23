import java.util.*;

public class AllbinaryCodes {

    public static boolean allCodes(String s, int k){
        Set<String> st = new HashSet<>();

        int codes = 1 << k; // pow(2, k) or 2^k;
        for(int i = k; i <= s.length(); i++){
            String sub = s.substring(i - k, i);
            if(!st.contains(sub)){
                st.add(sub);
                codes --;
            }
            if(codes == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "00110110";
        if(allCodes(s, 2)){
            System.out.println("String contains all Binary codes of size k");
        } else {
            System.out.println("Does not contains");
        }

    }
}
