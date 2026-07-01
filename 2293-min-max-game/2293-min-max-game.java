class Solution {
    public int minMaxGame(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }
        while (nums.length > 1) {
            int[] a = new int[nums.length / 2];
            for (int i = 0; i < nums.length / 2; i++) {
                if (i % 2 == 0) {
                    a[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                } else {
                    a[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            nums = a;
        }
        return nums[0];

    }
}