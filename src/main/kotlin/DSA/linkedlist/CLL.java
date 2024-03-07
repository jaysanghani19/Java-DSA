package DSA.linkedlist;

public class CLL {
    public static void main(String[] args) {
        CircularLL ll = new CircularLL();
        ll.insertAtFirst(25);
        ll.insertAtFirst(26);
        ll.insertAtFirst(27);
        ll.deleteAtIndex(2);
        System.out.println(ll);
    }
}
