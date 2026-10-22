class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        myset = set()

        for i in nums:
            myset.add(i)

        if(len(myset) == len(nums)):
            return False
        else:
            return True

        