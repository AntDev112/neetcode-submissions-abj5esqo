class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counts = {item: nums.count(item) for item in set(nums)}
        sorted_counts = sorted(counts , key=counts.get,reverse=True)
        toReturn = []
        for i in range(k):
            toReturn.append(sorted_counts[i])
        return toReturn


