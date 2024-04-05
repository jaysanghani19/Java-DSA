package DSA.linkedlist;

// Leetcode 2 - https://leetcode.com/problems/add-two-numbers/description/
public class LCProblem2 {

    static ListNode res = null;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean isl1 = true, isl2 = true;
        ListNode temp1 = l1, temp2 = l2, prev = l1;
        res = null;
        int remainder = 0;
        int finalSum = 0;
        boolean isRemainder = false;
        while (l1 != null || l2 != null) {

            int sum = 0;
            if (l1 != null && l2 != null) {
                sum = l1.val + l2.val;
            } else if (l1 != null) {
                sum = l1.val;
            } else {
                sum = l2.val;
            }
            if (remainder > 0) sum += (remainder);
            if (sum >= 10) {
                finalSum = sum % 10;
                System.out.println(finalSum);
                remainder = sum / 10;
                isRemainder = true;
            } else {
                finalSum = sum;
                remainder = 0;
                isRemainder = false;
            }

            insert(finalSum);
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (isRemainder) insert(remainder);
        return res;
    }

    static void insert(int val) {
        if (res == null) {
            res = new ListNode(val, null);
        } else {
            ListNode temp = res;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(val, null);
        }
    }
}
