class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMax(piles);
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long totalHou = requirdTime(piles, mid); 

            if (totalHou <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private long requirdTime(int[] nums, int rate) { 
        long totalHou = 0;

        for (int i = 0; i < nums.length; i++) {
            totalHou += (nums[i] + rate - 1) / rate;
        }
        return totalHou;
    }

    private int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
}