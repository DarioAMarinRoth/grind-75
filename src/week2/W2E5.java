package week2;

import entities.ListNode;

import java.util.Stack;

public class W2E5 {
    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode ans = null;
        ListNode aux;

        while (head != null) {
            aux = new ListNode(head.val);
            aux.next = ans;
            ans = aux;
            head = head.next;
        }
        return ans;
    }
}
