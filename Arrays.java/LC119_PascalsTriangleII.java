import java.util.ArrayList;
import java.util.List;

public class LC119_PascalsTriangleII {
    class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>row=new ArrayList<>();
         long ans =1;
         row.add(1);
         for(int col=1;col<=rowIndex;col++){
            ans=ans*(rowIndex-col+1);
            ans=ans/col;
            row.add((int)ans);
         }
         return row;
    }
}
}
