public class BinaryGap {
    public static int binaryGap(int n){
        int max = 0;
        int lastPos = -1;

        String binary = Integer.toBinaryString(n);

        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                if(lastPos != -1){
                    max = Math.max(max, i - lastPos);
                }
                lastPos = i;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int n = 22;
        System.out.println(binaryGap(n));

    }
}
