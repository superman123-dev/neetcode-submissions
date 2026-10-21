class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        twoSum = []
        for i in range (len(nums)):
            j = len(nums) - 1
            while(i < j):
                if(nums[i] + nums[j] == target):
                    twoSum.append(i)
                    twoSum.append(j)
                    return twoSum
                else:
                    j -= 1
        return twoSum
        
