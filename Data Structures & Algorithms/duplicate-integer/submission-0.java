class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        boolean torf = false;
        Set<Integer> set = new TreeSet<>(); 
        for (int i = 0; i < nums.length; i++){
            set.add(nums[i]);

        }
        if(nums.length != set.size()){
            return torf = true;
        }

        return torf;
        
    }
}