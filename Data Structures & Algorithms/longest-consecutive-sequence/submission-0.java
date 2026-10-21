class Solution {
    public int longestConsecutive(int[] nums) {

        int longestConsecutive = 0;
        Set<Integer> set = new TreeSet<>();
            
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        boolean temp = false;
        int count = 0;
        int previous = 0;

        for(int i: set){
           if(temp == false){
            count++;
            temp = true;
           } else if(i - previous == 1){
            count++;
           } else {
                if(longestConsecutive < count) {
                    longestConsecutive = count;
                }
                count = 1;
            }
           previous = i;
        }

        if(count > longestConsecutive){
            longestConsecutive = count;
        }

        return longestConsecutive;
        
       
    }
}
