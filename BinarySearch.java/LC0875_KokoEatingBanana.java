public class LC0875_KokoEatingBanana {
    public long findTotalHours(int[]piles,int k){
        long totalhours=0;
        for(int pile:piles){
            totalhours+=(pile+k-1)/k;
        }
        return totalhours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxpile=0;
        for(int pile:piles){
            maxpile=Math.max(maxpile,pile);
        }
        int low=1;
        int high=maxpile;
        while(low<=high){
            int mid=low+(high-low)/2;
            long totalhours=findTotalHours(piles,mid);
            if(totalhours<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}

