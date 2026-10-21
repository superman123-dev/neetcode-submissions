class Solution {
    public boolean hasDuplicate(int[] nums) {
    
        Set<Integer> arr = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            arr.add(num);
        }
        if(nums.length == arr.size()){
            return false;
        }
        return true;
    }
}