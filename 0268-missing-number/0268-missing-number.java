class Solution {
    public int missingNumber(int[] nums) {
        int res=0;
        int fr[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
            fr[nums[i]]++;
        for(int i=0;i<=nums.length;i++){
            if (fr[i]==0)
                res=i;
        }
        return res;
    }
}