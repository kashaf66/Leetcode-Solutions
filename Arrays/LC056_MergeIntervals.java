import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC056_MergeIntervals {
    public int[][] merge(int[][] intervals){
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>ans=new ArrayList<>();
        ans.get(intervals[0]);
        for(int i=1;i<n;i++){
            int [] last=ans.get(ans.size()-1);
            if(intervals[i][0]<=last[1]){
                last[1]=Math.max(last[1],intervals[i][1]);
            }else{
              ans.add(intervals[i]);
        }
    }
    return ans.toArray(new int [ans.size()][]);
}
}
