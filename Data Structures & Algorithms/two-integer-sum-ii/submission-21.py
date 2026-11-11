class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:

        l = 0
        r = len(numbers) - 1
        twoSum = []
        while l < r:
            if numbers[l] + numbers[r] == target:
                twoSum.extend([l + 1,r + 1])
                return twoSum
            elif numbers[l] + numbers[r] > target:
                r = r - 1
            elif numbers[l] + numbers[r] < target:
                l = l + 1
        return twoSum
        
        