import java.util.ArrayList;
import java.util.List;

public class LC0054_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer>ans= new ArrayList<>();
        int top=0;
        int bottom=matrix.length;
        int left=0;
        int right=matrix[0].length;
        while(left<=right && top<=bottom){
            for(int i=left;left<=right;left++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top;top<=bottom;top++){
                ans.add(matrix[i][right]);
            }
            right--;
        if(top<=bottom){
            for(int i=right;i>=left;right--){
                ans.add(matrix[bottom][i]);
            }
            bottom--;
        }
        if(top<=bottom){
            for(int i= bottom;i>=top;bottom--){
                ans.add(matrix[i][left]);
            }
            left--;
        }
        }
        return ans;
    }
}
