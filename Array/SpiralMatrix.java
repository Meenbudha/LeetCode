
import java.util.ArrayList;

public class SpiralMatrix {

    public static ArrayList<Integer> SpiralMatrix(int[][] mat){
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;

        ArrayList<Integer> ans = new ArrayList<>();

        while (top <= bottom && left <= right) { 
            //top to bottomm
            for(int i = left; i <= bottom; i++){
                ans.add(mat[i][left]);
            }
            left ++;
            //bottom to right;
            if(left <= right){
                for(int i = left; i <= right; i++){
                    ans.add(mat[bottom][i]);
                }
                bottom --;
            }
            //bottom to top
            if(top <= bottom){
                for(int i = bottom; i >= top; i--){
                    ans.add(mat[i][right]);
                }
                right--;
            }
            //left to right
            if(left <= right){
                for(int i = right; i >= left; i--){
                    ans.add(mat[top][i]);
                }
                top++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println(SpiralMatrix(mat));
    }
}
