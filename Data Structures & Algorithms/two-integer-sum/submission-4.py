class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        l = 0
        r = len(nums) - 1
        # Create a list of (value, index) pairs and sort them by value
        indexed_nums = sorted([(num, i) for i, num in enumerate(nums)])
        
        while l < r:
            currSum = indexed_nums[l][0] + indexed_nums[r][0]
            if currSum == target:
                # Get original indices and return them in ascending order
                res = [indexed_nums[l][1], indexed_nums[r][1]]
                res.sort()
                return res
            elif currSum < target:
                l += 1
            else:
                r -= 1 
        return None