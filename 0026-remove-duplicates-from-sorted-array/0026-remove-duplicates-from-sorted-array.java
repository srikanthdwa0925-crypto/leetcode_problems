class Solution {
    public int removeDuplicates(int[] nums) {
        int crr=0;
            for(int j=1; j<nums.length;j++){
                if(nums[crr] != nums[j]){
                    nums[crr+1]=nums[j];

                    crr++;

                    

                     
                }
            }
        
        return crr+1;

        
    }
}