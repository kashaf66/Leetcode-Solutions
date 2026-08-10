import java.util.Arrays;

public class LC1552_MagneticFieldBetweenTwoBalls {
    public boolean canplace(int[] position,int m,int distance){
        int count=1;
        int last=position[0];
         int n=position.length;
        for(int i=1;i<n;i++){
            if(position[i]-last>=distance){
                count++;
                last=position[i];
                if(count==m){
                    return true;
                }
            }
        }
         return false;   
    }
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
       int  low=1;
        int  high=position[n-1]-position[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canplace(position,m,mid)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
}
