class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int product=1;

        for(int i=0; i<nums.length; i++){
             product=(nums[n-1]-1) * (nums[n-2]-1);
        }
        return product;

        
    }
}