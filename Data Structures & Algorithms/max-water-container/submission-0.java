class Solution {
    public int maxArea(int[] heights) {
        
        int maxArea = 0;
        int l = 0;
        int r = heights.length - 1;
        while (l < r){
            int num = r - l;
            int mini = Math.min(heights[l], heights[r]);
            int sum = num * mini;
            if(sum > maxArea){
                maxArea = sum;
            }
            if(heights[l] < heights[r]){
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }
}
