class Solution {
    public int[] concatWithReverse(int[] nums) {
        int arr[]= new int[2*nums.length];

        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        int j=0;
        for(int i=nums.length-1;i>=0;i--){
            arr[nums.length+j]=nums[i];
            j++;
        }
        return arr;
    }
}
    