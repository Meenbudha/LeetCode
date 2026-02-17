import java.util.*;
class kidsWithCandies {
    public static List<Boolean> kidCandies(int[] candies, int extraCandies) {
        List<Boolean> ls = new ArrayList<>();
        int max = 0;
        for(int num: candies){
            max = Math.max(num, max);
        }
        for(int i = 0; i < candies.length; i++){
            int val = candies[i] + extraCandies;
            if(val >= max){
                ls.add(true);
            } else
                ls.add(false);
        }
        return ls;
    }
    public static void main(String[] args) {
        int nums[] = {1,4,2,5,2};
        int n = 3;

        List<Boolean> ls = kidCandies(nums, n);

        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }
    }
}

