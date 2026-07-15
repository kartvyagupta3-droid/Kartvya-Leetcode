class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
       
        int n=nums.length;
        int temp []=new int [n];   
        int i = 1;
        int j = n - 1;
       
        while(i < n) {
            temp[i] = nums[j];
            i = i + 2;
            j--;
        }
        i = 0; 
        while(i < n) {
            temp [i] = nums[j];
            i = i + 2;
            j--;
        }
        for(int k=0; k<n; k++) {
            nums[k] = temp[k];
    } 
    }
}