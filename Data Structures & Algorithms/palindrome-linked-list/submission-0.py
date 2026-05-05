# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        nodes = []
        curr = head
        while curr:
            nodes.append(curr)
            curr = curr.next

        l = 0
        r = len(nodes) - 1

        while l < r:
            if nodes[l].val != nodes[r].val:
                return False
            l+=1
            r-=1

        return True  
