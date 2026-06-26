class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                int pre=h.get(nums[i]);
                if(i-pre <=k)
                    return true;
            }
            h.put(nums[i],i);
        }
        return false;

        // Set<Integer> s=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(i>k){
        //         s.remove(nums[i-k-1]);
        //     }
        //     if(s.contains(nums[i]))
        //         return true;
        //     s.add(nums[i]);
        // }
        // return false;
    }
}