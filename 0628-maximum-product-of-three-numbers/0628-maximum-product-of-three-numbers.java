class Solution {
    public int maximumProduct(int[] nums) {
        int p=1;
        for(int i=0; i<nums.length; i++){
            p=p*nums[i];
        }
        return p;
    }
}