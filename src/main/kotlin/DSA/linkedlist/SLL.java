package DSA.linkedlist;


public class SLL {
    public static void main(String[] args) {
        SinglyLinkLIst list = new SinglyLinkLIst();
        list.insertAtFirst(32);
        list.insertAtFirst(32);
        list.insertAtFirst(29);
        list.insertAtFirst(27);
        list.insertAtFirst(27);

//        SinglyLinkLIst list2 = new SinglyLinkLIst();
//        list.insertAtFirst(23);
//        list2.insertAtFirst(25);
//        list2.insertAtFirst(25);
//        list2.insertAtFirst(25);
//        list2.insertAtFirst(25);
//        list2.insertAtFirst(23);
//        list2.insertAtFirst(21);
//        list.insertRecursion(45,2);
//        list.deleteDuplicates();
//        list.reverse(list.head);
        list.print();
    }
}
