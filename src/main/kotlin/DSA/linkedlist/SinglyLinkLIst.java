package DSA.linkedlist;

public class SinglyLinkLIst {
    Node head, tail;
    int size = 0;

    public void insertAtFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertAtEnd(int value) {
        Node node = new Node(value);
        size++;

        if (head == null) {
            head = tail;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void insertAtIndex(int val, int index) {
        if (index == 0) {
            insertAtFirst(val);
            return;
        }
        if (index == size) {
            insertAtEnd(val);
            return;
        }
        if (index > size) {
            System.out.println("Index is larger than size");
            return;
        }
        if (index < 0) {
            System.out.println("Index is less than 1");
            return;
        }
        Node previous = head, current = head.next;

        for (int i = 0; i < index - 1; i++) {
            previous = previous.next;
            current = current.next;
        }
        Node node = new Node(val, current);
        previous.next = node;
        size++;
    }

    public void insert(int value){
        insertAtEnd(value);
    }

    public void deleteFirst(){
        head=head.next;
        size--;
    }
    public void deleteLast(){
        Node temp = head;
        for (int i = 0; i < size-1; i++) {
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }


    public void deleteAtIndex(int index){
        if (index >= size) {
            System.out.println("Index is larger than size");
            return;
        }
        if (index < 0) {
            System.out.println("Index is less than 1");
            return;
        }
        if (index==0) {
            deleteFirst();
            return;
        }
        if (index==(size-1)) {
            deleteLast();
            return;
        }
        Node prev = get(index - 1);
        int val = prev.next.val;

        prev.next = prev.next.next;
        size--;
    }

    public void deleteValue(int value){
        if (head.val==value){
            head=head.next;
            size--;
            return;
        }
        if (tail.val==value){
            Node node = get(size-1);
            node.next=null;
            size--;
            return;
        }
        Node current = head.next;
        Node previous = head;
        for (int i = 0; i < size-1; i++) {
            if (current.val==value){
                previous.next=current.next;
//                current=null;
                size--;
                return;
            }
            current=current.next;
            previous=previous.next;
        }
        System.out.println("Not Found");
    }
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void print() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node node) {
            this.val = val;
            this.next = node;
        }
    }
}
