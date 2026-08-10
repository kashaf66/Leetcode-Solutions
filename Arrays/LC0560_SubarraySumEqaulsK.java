import java.util.HashMap;

public class LC0560_SubarraySumEqaulsK {
    public int subarraySum(int[] nums, int k) {
        int n =nums.length;
       HashMap<Integer,Integer>map=new HashMap<>();
       map.get(0,1);
       int sum=0;
       int count=0;
       for(int i=0;i<n;i++){
        sum+=nums[i];
        int rem= sum-k; 
        if(map.containsKey(rem)){
            count+=map.get(rem);
        }
        map.put(sum,map.getOrDefault(sum, 0)+1);
       }
       return count;
    }
}
