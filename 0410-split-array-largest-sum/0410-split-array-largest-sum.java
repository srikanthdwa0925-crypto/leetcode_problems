class Solution {

    public int countSubarrays(int[] nums, int maxSum) {
        int count = 1;
        int sum = 0;

        for (int num : nums) {
            if (sum + num <= maxSum) {
                sum += num;
            } else {
                count++;
                sum = num;
            }
        }

        return count;
    }

    public int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (countSubarrays(nums, mid) <= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}

// int max=Integer.MIN_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     int sum=0;
           
        //     for(int j=i; j<k; j++){
        //         sum += nums[j];
        //         max=Math.max(max,sum);
                
        //     } 
        // }
        // return max;





         // int low=0,high=nums.length-1;
        // int max=Integer.MIN_VALUE;
        // int first=0;
        // int second=0;
        // while( low < high){
        //     int mid=low+(high-low)/2;
        //     int sum=0;
        //     for(int i=low;i<mid;i++){
        //         sum += nums[i];
        //         first=sum;


        //     }
        //     int su=0;
        //     for(int i=mid+1;i<high;i++)
        //     su += nums[i];
        //     second=sum;
        //     max=Math.max(first,second);


        // }
        // return max;