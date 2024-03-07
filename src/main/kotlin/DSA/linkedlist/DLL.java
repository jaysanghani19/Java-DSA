package DSA.linkedlist;

public class DLL {
    public static void main(String[] args) {
        DoubleLL ll = new DoubleLL();
        ll.insertAtStart(25);
        ll.insertAtStart(27);
        ll.insertAtStart(29);
        ll.insertAtStart(24);
//        ll.insertAtIndex(22,2);
//        ll.insertAtIndex(25,3);
//        ll.deleteFirst();
//        ll.deleteLast();
        ll.deleteAtIndex(3);
        System.out.println(ll);
    }
}
