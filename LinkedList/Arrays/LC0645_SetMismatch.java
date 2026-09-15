public class LC0645_SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int []freq =new int[n+1];
        for(int num:nums){
            freq[num]++;
        }
        int repetition=-1;
        int missing=-1;
        for(int i=1;i<=n;i++){
            if(freq[i]==2){
                repetition=i;
            }
            if(freq[i]==0){
                missing=i;
            }
        }
        return new int[]{repetition,missing};
    }
}
