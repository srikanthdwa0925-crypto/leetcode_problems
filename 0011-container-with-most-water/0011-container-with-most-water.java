class Solution {
    public int maxArea(int[] height) {
        int left=0; int right=height.length-1;
        int h=1;
        int total=0;
        while(left<right){
            h=Math.min(height[left],height[right]);
            total=Math.max(h *(right-left),total);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return total;
        
    }
}