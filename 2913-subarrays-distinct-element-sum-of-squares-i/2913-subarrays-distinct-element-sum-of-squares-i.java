class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
        int n = nums.size();
        // List<List<Integer>> subArray = new ArrayList<>();
        for(int i = 0; i < n; i++){
            HashSet<Integer> set = new HashSet<>();
            // List<Integer> ls = new ArrayList<>();

            for(int j = i; j < n; j++){
                set.add(nums.get(j));
                // ls.add(nums.get(j));
                // subArray.add(new ArrayList<>(ls));
                int distinct = set.size();
                ans += distinct * distinct;
            }
        }
        // System.out.print(subArray);
        return ans;
    }
}