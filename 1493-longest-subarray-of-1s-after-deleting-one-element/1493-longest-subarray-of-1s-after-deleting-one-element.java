class Solution {
    public int longestSubarray(int[] nums) {
        
        int l=0,z=0,a=0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                z++;
            }
            while(z>1){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }
            a=Math.max(a,i-l);
        }
        return a;
    }
}