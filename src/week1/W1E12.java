package week1;

import entities.ListNode;

public class W1E12 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return false;
        }

        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;

        }
        return false;
    }
}
