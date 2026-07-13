class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int start = 0, end = m-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            int row = 0;
            for(int i = 0; i < n; i++){
                if(mat[i][mid] > mat[row][mid]){
                    row = i;
                }
            }

            boolean leftGreater = (mid - 1 >= 0 && mat[row][mid-1] > mat[row][mid]);
            boolean rightGreater = (mid + 1 < m && mat[row][mid+1] > mat[row][mid]);

            if(!leftGreater && !rightGreater){
                return new int[]{row, mid};
            } else if(leftGreater){
                end = mid-1;
            } else {
                start = mid + 1;
            }

        }
        return new int[]{-1, -1};
    }
}