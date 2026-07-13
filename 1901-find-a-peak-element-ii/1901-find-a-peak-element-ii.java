class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] ans = new int[2];
        int peak = mat[0][0];
        
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] > peak){
                    peak = mat[i][j];
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}