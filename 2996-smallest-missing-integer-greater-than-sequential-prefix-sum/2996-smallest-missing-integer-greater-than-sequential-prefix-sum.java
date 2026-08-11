class Solution {
    public int missingInteger(int[] nums) {

        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];

        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1] + 1) {
                prefix[i] = nums[i];
                sum += nums[i];
            } else {
                break;
            }
        }

        while (true) {

            boolean found = false;

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == sum) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return sum;
            }

            sum++;
        }
    }
}