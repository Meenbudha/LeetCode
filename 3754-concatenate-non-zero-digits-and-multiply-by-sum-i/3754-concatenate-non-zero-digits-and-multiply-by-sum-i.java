class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb = new StringBuilder();
        if(n == 0) return 0;
        int sum = 0;

        while(n > 0){
            int x = n%10;
            if(x != 0){
                sum += x;
                sb.append(x);
            }
            n /= 10;
        }
        String reversed = sb.reverse().toString();
        return Long.parseLong(reversed) * sum;
    }
}