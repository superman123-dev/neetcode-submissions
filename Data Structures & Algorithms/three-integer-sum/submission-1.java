class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> threeSum = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int j = nums.length - 1;
            int k = i + 1;
            while(k < j){
                if(nums[i] + nums[k] + nums[j] == 0){
                    if(!threeSum.contains(Arrays.asList(nums[i], nums[k], nums[j]))){
                        threeSum.add(Arrays.asList(nums[i], nums[k], nums[j]));
                    }
                    k++;
                    j--;
                } else if(nums[i] + nums[k] + nums[j] > 0){
                    j--;
                } else if(nums[i] + nums[k] + nums[j] < 0){
                    k++;
                } else if(nums[j] == nums[j + 1]){
                    j--;
                } else if(nums[k] == nums[k + 1]){
                    k++;
                }
            }
        }
        return threeSum;
    }
}
