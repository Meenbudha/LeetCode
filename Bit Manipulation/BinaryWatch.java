import java.util.*;
class BinaryWatch{
    public static List<String> binaryWatch(int turnedOn){
        List<String> result = new ArrayList<>();

        for(int hr = 0; hr < 12; hr++){
            for(int min = 0; min < 60; min++){
                int totalBit = Integer.bitCount(hr) + Integer.bitCount(min);
                if(totalBit == turnedOn){
                    result.add(hr + ":" + (min < 10 ? "0"+min : min));
                }
            }
        }
        return result;
    }
    public static void print(List<String> ls){
        for(int i = 0; i < ls.size(); i++){
            System.out.print(ls.get(i) + " ");
        }
        System.err.println("");
    }
    public static void main(String[] args) {
        int n = 4;
        List<String> ls = binaryWatch(1);
        print(ls);
    }
}