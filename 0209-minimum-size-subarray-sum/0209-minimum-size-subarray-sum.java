class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,right=0,sum=0,minl=Integer.MAX_VALUE;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>=target){
                 minl=Math.min(minl,right-left+1);
                sum-=nums[left];
                left++;
            }
            right++;
            // minl=Math.min(minl,right-left+1);
            
        }
        // return minl;
        return (minl==Integer.MAX_VALUE)?0:minl;
    }
}