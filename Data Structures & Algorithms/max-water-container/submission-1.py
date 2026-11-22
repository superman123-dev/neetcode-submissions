class Solution:
    def maxArea(self, heights: List[int]) -> int:

        l = 0
        r = len(heights) - 1
        maxArea = 0

        while l < r:
            w = r - l
            h = min(heights[l], heights[r])
            currsum = w * h
            print(currsum)

            if maxArea < currsum:
                maxArea = currsum
            elif heights[l] > heights[r]:
                r -= 1
            elif heights[l] < heights[r]:
                l += 1
            else:
                l += 1
                r -= 1
        return maxArea
        