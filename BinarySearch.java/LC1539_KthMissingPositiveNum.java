public class LC1539_KthMissingPositiveNum {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low);
            int missing=arr[mid]-(mid+1);
            if(missing<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
      return low+k;      
      
    }
}
