class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        values = {}
        for val in nums:
            if val not in values:
                values[val] = 1
            elif val in values:
                return True
        
        return False