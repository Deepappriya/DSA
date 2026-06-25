class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0,h=nums.length-1;
        while (l<h){
            if(nums[l]+nums[h]==target)
                return new int[]{l+1,h+1};
            else if (nums[l]+nums[h]>target)
                h--;
            else 
                l++;
            
        }
        return new int[]{-1,-1};
   }
}