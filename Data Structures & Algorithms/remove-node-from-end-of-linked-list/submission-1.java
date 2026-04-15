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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        List<ListNode> list = new ArrayList<>();

        while(curr != null) {
            list.add(curr);
            curr = curr.next;
        }
        if(list.size() - n - 1 < 0) {
            head = list.get(list.size() - n).next;
        }
        else {
        list.get(list.size()-n-1).next = list.get(list.size()-n).next;
        }
        return head;
    }
}
