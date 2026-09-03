class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        p1 = 0
        p2 = p1

        maxNum = 0

        while p1 < len(arr) - 1:
            p2 = p1 + 1
            maxNum = 0
            while p2 < len(arr):
                maxNum = max(maxNum, arr[p2])
                p2+=1
            arr[p1] = maxNum
            p1+=1

        arr[len(arr) - 1] = - 1

        return arr