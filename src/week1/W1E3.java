// Merge two sorted lists

package week1;

import entities.ListNode;

public class W1E3 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        ListNode head = mergedList;

        while (true) {

            if (list1 == null) {
                mergedList.next = list2;
                break;
            }

            if (list2 == null) {
                mergedList.next = list1;
                break;
            }

            if (list1.val < list2.val) {
                mergedList.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                mergedList.next = new ListNode(list2.val);
                list2 = list2.next;
            }

            mergedList = mergedList.next;
        }

        return head.next;
    }

}
