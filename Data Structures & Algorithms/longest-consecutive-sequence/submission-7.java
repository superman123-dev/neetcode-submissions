class Solution {
    public int longestConsecutive(int[] nums) {
        int longestConsecutive = 0;
        Set<Integer> set = new TreeSet<>();
        
        if(nums.length == 0){
            return longestConsecutive;
        }
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }


        int count = 1;
        int prev = 0;
        boolean check = false;
        for(int num: set){
            if(check == false){
                prev = num;
                check = true;
            } else if((num - prev) == 1){
                count++;
                prev = num;
            } else {
                if(count > longestConsecutive){
                    longestConsecutive = count;
                }
                count = 1;
                prev = num;
            }

        }
        if(count >longestConsecutive){
            longestConsecutive = count;
        }

        return longestConsecutive;
    }
}
