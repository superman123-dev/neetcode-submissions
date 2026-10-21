class Solution {
    public boolean hasDuplicate(int[] nums) {
        

        boolean hasDuplicate = true;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        if(set.size() == nums.length){
            hasDuplicate = false;
        }

        return hasDuplicate;

    }
}