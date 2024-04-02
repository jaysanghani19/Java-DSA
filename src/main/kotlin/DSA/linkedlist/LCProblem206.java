package DSA.linkedlist;

// Leetcode 206 - https://leetcode.com/problems/reverse-linked-list/description/
public class LCProblem206 {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=null,curr=head,next=head.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }
        head=prev;
        return head;
    }
}
