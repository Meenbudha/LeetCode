class Solution {
    public long sumAndMultiply(int n) {
        long ans = 0;
        int num = 0;
        int sum = 0;

        while(n != 0){
            if(n % 10 != 0){
                sum += n % 10;
                num = num * 10 + n % 10;
            }
            n /= 10;
        }

        while(num != 0){
            ans = ans * 10 + num % 10;
            num /= 10;
        }
        return ans * sum;
    }
}