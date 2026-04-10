class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;
        //Reversing the second 
        while(second != null) {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        //Joining the two lists
        ListNode first = head;
        second = prev;
        while(second != null) {
            ListNode t1 = first.next;
            ListNode t2 = second.next;
            first.next = second;
            second.next = t1;
            first = t1;
            second = t2;
        }

    }
}