package DSA.linkedlist;

public class SortingAndLCProblem148 {

    public static ListNode bubbleSort(ListNode head) {
        if (head == null || head.next == null) return head;
        int size = getSize(head);
        ListNode curr = head, next = head.next;
        for (int i = 0; i < size; i++) {
            curr = head;
            next = curr.next;
            for (int j = 0; j < size - i - 1; j++) {
                if (curr.val > next.val) {
                    int temp = curr.val;
                    curr.val = next.val;
                    next.val = temp;

                }
                curr = curr.next;
                next = next.next;
            }
        }
        return head;
    }

    public static int getSize(ListNode head) {
        ListNode temp = head;
        int res = 0;
        while (temp != null) {
            temp = temp.next;
            res++;
        }
        return res;
    }

    public static ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode mid = middleNode(head);

        return mergeTwoLists(mergeSort(head), mergeSort(mid));

    }

    //    Finding Middle
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //    Merging Two List
    static ListNode res = null;

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        res = null;
        if (list1 == null && list2 == null) {
            return list1;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode l1 = list1, l2 = list2;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                insert(l1, res);
                l1 = l1.next;
            } else {
                insert(l2, res);
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            insert(l1, res);
            l1 = l1.next;
        }
        while (l2 != null) {
            insert(l2, res);
            l2 = l2.next;
        }
        return res;
    }

    static void insert(ListNode in, ListNode head) {
        if (res == null) {
            res = new ListNode(in.val, null);
        } else {
            ListNode temp = res;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(in.val, null);
        }
    }
}
