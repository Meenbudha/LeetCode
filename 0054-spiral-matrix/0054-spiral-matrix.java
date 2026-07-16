class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ls = new ArrayList<>();

        int top = 0;
        int bottom = mat.length - 1;
        int left = 0;
        int right = mat[0].length - 1;

        while(top <= bottom && left <= right){
            //top row 
            for(int i = left; i <= right; i++){
                ls.add(mat[top][i]);
            }
            top++;

            //right column
            for(int i = top; i <= bottom; i++){
                ls.add(mat[i][right]);
            }
            right--;

            //bottom row
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    ls.add(mat[bottom][i]);
                }
                bottom--;
            }
            //left column
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    ls.add(mat[i][left]);
                }
                left++;
            }
        }
        return ls;
    }
}