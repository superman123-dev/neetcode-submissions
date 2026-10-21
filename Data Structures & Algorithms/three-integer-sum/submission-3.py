class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        threeSum = []
        for i in range(len(nums)):
            j = len(nums) - 1
            k = i + 1
            if i != 0 and nums[i] == nums[i - 1]:
                continue
            while k < j:
                if nums[i] + nums[j] + nums[k] == 0:
                    threeSum.append([nums[i],nums[j],nums[k]])
                    k += 1
                    j -= 1
                    while k < j and nums[j] == nums[j + 1]:
                        j -= 1
                    while k < j and nums[k] == nums[k - 1]:
                        k += 1
                elif nums[i] + nums[j] + nums[k] > 0:
                    j -= 1
                elif nums[i] + nums[j] + nums[k] < 0:
                    k += 1
        return threeSum
