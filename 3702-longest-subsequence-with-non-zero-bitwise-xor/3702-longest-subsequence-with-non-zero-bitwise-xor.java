class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        if (xor != 0) {
            return nums.length;
        }

        for (int num : nums) {
            if (num != 0) {
                return nums.length - 1;
            }
        }

        return 0;
    }
}
        // int max=0;
        // int i=nums[0];
        // int xor=0;

        // for(int j=i;j<nums.length;j++){
        //     xor ^= nums[j];
        //     if(xor !=0 ){
        //         int length=j-i+1;
        //         max=Math.max(max,length);

        //     }
        // }
        