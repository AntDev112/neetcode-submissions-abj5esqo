class Solution {
    public void reorderList(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            nodes.add(curr);
            curr = curr.next;
        }

        int p1 = 0;
        int p2 = nodes.size() - 1;

        while (p1 < p2) {
            nodes.get(p1).next = nodes.get(p2);  // left → right
            p1++;

            if (p1 == p2) break;                  // odd-length guard

            nodes.get(p2).next = nodes.get(p1);  // right → new left
            p2--;
        }

        nodes.get(p1).next = null;                // null-terminate
    }
}