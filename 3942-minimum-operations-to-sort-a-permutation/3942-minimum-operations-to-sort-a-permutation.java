class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int zero = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero = i;
                break;
            }
        }

        boolean inc = true, dec = true;

        for (int i = 0; i < n; i++) {
            int next = nums[(i + 1) % n];

            if (next != (nums[i] + 1) % n) {
                inc = false;
            }

            if (next != (nums[i] - 1 + n) % n) {
                dec = false;
            }
        }

        if (!inc && !dec) return -1;

        long ans = Long.MAX_VALUE;

        if (inc) {
            ans = Math.min(ans, zero);              // rotate only
            ans = Math.min(ans, n - zero + 2);     // R -> rotate -> R
        }

        if (dec) {
            ans = Math.min(ans, 1L + (n - 1 - zero));   // R first
            ans = Math.min(ans, 1L + ((zero + 1) % n)); // rotate first
        }

        return (int) ans;
    }
}