import java.util.*;

public class BinarySpecialString {
        public static String makeSpecialString(String s){
        List<String> special = new ArrayList<>();
        int sum = 0;
        int start = 0;

        for(int i = 0; i < s.length(); i++){
            sum += s.charAt(i) == '1'? +1 : -1;
            if(sum == 0){
                String inner = s.substring(start + 1, i);
                special.add("1" + makeSpecialString(inner) + "0");
                start = i + 1;
            }
        }
        special.sort(Collections.reverseOrder());
        return String.join("", special);
    }
    public static void main(String[] args){
        String s = "11011000";
        System.out.println(makeSpecialString(s));
    }
}
