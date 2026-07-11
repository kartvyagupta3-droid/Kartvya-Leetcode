class Solution {
    public int maxArea(int[] height) {
       int s=0,end=height.length-1, mx=0;
       while(s<end){
       mx=Math.max(mx,(end-s) * Math.min(height[end] , height[s]));
        if(height[s]>height[end]){
            end--;
        }else{
            s++;
        }
       }
       return mx;
    }
}