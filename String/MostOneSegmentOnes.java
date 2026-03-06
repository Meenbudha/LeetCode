public class MostOneSegmentOnes {

    public static boolean Check(String s){
        boolean seenZero = false;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                seenZero = true;
            } else if(seenZero && s.charAt(i) == '1'){
                return false;
            }
        }
    return true;
    }
    public static void main(String[] arts){
        String s = "100";
        System.out.println(Check(s));
    }
}
