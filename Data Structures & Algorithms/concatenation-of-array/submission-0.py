class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        n = len(nums)
        numsExpanded = [0]*2*n
        for i in range(0,len(numsExpanded)):
            numsExpanded[i] = nums[i%n]
        return numsExpanded
        