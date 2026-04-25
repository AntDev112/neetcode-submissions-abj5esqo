/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummy = new ListNode();
      ListNode cop = dummy;
      int carry = 0;
      while(l1 != null || l2 != null) {
        int sum;

        if(l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;
        } else if(l1 != null) {
            sum = l1.val + carry;
        } else {
            sum = l2.val+carry;
        }

        dummy.next = new ListNode(sum >= 10 ? sum - 10 : sum);
        carry = sum >= 10 ? 1:0;
        l1 = l1 !=null ? l1.next : null;
        l2 = l2 != null ? l2.next : null;
        dummy = dummy.next;
      }

      if(carry != 0) {
        dummy.next = new ListNode(1);
      }

      return cop.next;
    }
}
