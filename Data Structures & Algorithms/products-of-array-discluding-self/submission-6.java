class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] productExceptSelf = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        int sum1 = 1;
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                left[i] = sum1;
            } else{
                sum1 *= nums[i-1];
                left[i] = sum1;
            }
            
        }

        int sum2 = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(i == nums.length - 1){
                right[i] = sum2;
            } else{
                sum2 *= nums[i+1];
                right[i] = sum2;
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            productExceptSelf[i] = left[i] * right[i];
        }
            
        
        
        return productExceptSelf;
    }
}  
