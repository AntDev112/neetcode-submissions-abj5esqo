# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def plusOne(self, head: ListNode) -> ListNode:
        curr = head
        stack = deque()

        while curr:
            stack.append(curr)
            curr = curr.next
        
        last = stack.pop()
        carry = 1 if last.val + 1 > 9 else 0
        last.val = last.val + 1 - 10 if carry == 1 else last.val + 1

        while carry != 0 and len(stack) != 0:
            last = stack.pop()
            carry = 1 if last.val + 1 > 9 else 0
            last.val = last.val + 1 - 10 if carry == 1 else last.val + 1
        
        if carry != 0:
            first = ListNode(carry)
            first.next = head
            return first
        else:
            return head

            
        



        