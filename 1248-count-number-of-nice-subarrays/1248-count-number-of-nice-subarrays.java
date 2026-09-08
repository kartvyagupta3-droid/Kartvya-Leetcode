class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
    return atmost(nums,k)-atmost(nums,k-1);
    }
    private int atmost(int [] nums, int k){
        //[1,1,2,1,1]
        int oddc=0,l=0,c=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==1){
                oddc++;
            }
            while(oddc>k){
                if(nums[l]%2==1){
                    oddc--;
                }
                l++;
            }
            c+=i-l+1;
        }
        return c;
    }
}