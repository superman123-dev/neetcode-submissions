class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        
        int[] twoSum = new int[2];
        int count = numbers.length - 1;
        int i = 0;
        while(i < count) {
            if(numbers[i] + numbers[count] == target){
                twoSum[0] = i + 1;
                twoSum[1] = count + 1;
                return twoSum;
            } else if((numbers[i] + numbers[count]) > target){
                count--;
            } else if((numbers[i] + numbers[count]) < target){
                i++;
            }
        }
        return twoSum;
    }
}
