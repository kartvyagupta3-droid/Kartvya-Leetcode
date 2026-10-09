class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int l=1;
         int high=0;
         
         for(int pile:piles){
           high=Math.max(high,pile);
         }
         int res=high;

         while(l<=high){
            int mid=l+(high-l)/2;
            long hn=0;

            for(int pile:piles){
                hn+=(pile+mid-1)/mid;
            }
            if(hn<=h){
                res=mid;
                high=mid-1;
            }else{
                l=mid+1;
            }
         }
         return res;
    }
}