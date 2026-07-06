class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        int cover = 0;

        for(int i = 0; i < n; i++){
            boolean isCovered = false;
            for(int j = 0; j < n; j ++){
                if(i != j && intervals[j][0] <= intervals[i][0] 
                && intervals[j][1] >= intervals[i][1]){
                    isCovered = true;
                    break;
                }
            }
            if(isCovered){
                cover++;
            }
        }
        return n - cover;
    }
}