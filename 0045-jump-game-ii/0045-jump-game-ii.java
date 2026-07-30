class Solution {
    public int jump(int[] nums) {

        int n = nums.length;
        if (n <= 1) {
            return 0;}

        int jumps = 0;
        int cur = 0;
        int maxR= 0;
            
        for (int i = 0; i < n - 1; i++) {
            maxR= Math.max(maxR, i + nums[i]);
            if (i == cur) {
                jumps++;
                cur = maxR;

    
                if (cur >= n - 1) break;
            }
        }

        return jumps;
    }
} 
    