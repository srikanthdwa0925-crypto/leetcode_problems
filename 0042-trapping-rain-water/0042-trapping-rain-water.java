class Solution {
    public int trap(int[] height) {
        int left=0, right=height.length-1, lmax = 0, rmax = 0, result = 0;
        while(left<right){
            if(height[left]<height[right]){
                lmax = Math.max(lmax,height[left]);
                result+=lmax-height[left];
                left+=1;
            }
            else{
                rmax = Math.max(rmax,height[right]);
                result+=rmax-height[right];
                right--;
            }
        }
        return result;
    }
}