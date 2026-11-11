class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long a = 1L * need1 * cost1 + 1L * need2 * cost2;

        long b = 1L * Math.max(need1, need2) * costBoth;

        int mn = Math.min(need1, need2);

        long c = 1L * mn * costBoth
               + 1L * (need1 - mn) * cost1
               + 1L * (need2 - mn) * cost2;

        return Math.min(a, Math.min(b, c));
    }
}