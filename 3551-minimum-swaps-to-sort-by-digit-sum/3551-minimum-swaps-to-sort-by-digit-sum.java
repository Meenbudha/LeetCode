class Solution {

    private int digitSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;

        Integer[] sorted = new Integer[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = nums[i];
        }

        Arrays.sort(sorted, (a, b) -> {
            int sa = digitSum(a);
            int sb = digitSum(b);

            if (sa != sb) {
                return sa - sb;
            }
            return a - b;
        });

        Map<Integer, Integer> targetPos = new HashMap<>();

        for (int i = 0; i < n; i++) {
            targetPos.put(sorted[i], i);
        }

        int[] perm = new int[n];

        for (int i = 0; i < n; i++) {
            perm[i] = targetPos.get(nums[i]);
        }

        boolean[] vis = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {

            if (vis[i] || perm[i] == i) {
                continue;
            }

            int len = 0;
            int cur = i;

            while (!vis[cur]) {
                vis[cur] = true;
                cur = perm[cur];
                len++;
            }

            swaps += len - 1;
        }
        return swaps;
    }
}