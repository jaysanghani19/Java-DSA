package DSA.linkedlist;

public class CircularLL {
    int size;
    CLLNode head,tail;

    CircularLL(){
        size=0;
        tail=head;
    }

    public void insertAtFirst(int value){
        CLLNode node = new CLLNode(value);
        node.right=head;
        head=node;
        if (size==0){
            head.right=head;
            tail=head;
        }
        tail.right=head;
        size++;
    }

    public void insertAtEnd(int value){
        if (head==null){
            insertAtFirst(value);
            return;
        }
        CLLNode node = new CLLNode(value);
        CLLNode temp = head;
        for (int i = 0; i < (size-1); i++) {
            temp=temp.right;
        }
        temp.right=node;
        node.right=head;
        tail=node;
        size++;
    }

    public void deleteFirst(){
        if (size==1){
            head=null;
            tail=null;
            size--;
            return;
        }
        if (size==2){
            head=head.right;
            tail.right=tail;
            size--;
            return;
        }
        head=head.right;
        tail.right=head;
        size--;
    }

    public void deleteLast(){
        if (size==1){
            head=null;
            tail=null;
            size--;
            return;
        }
        if (size==2){
            tail=head;
            tail.right=head;
            size--;
            return;
        }

        CLLNode temp = head;
        for (int i = 0; i < (size-1); i++) {
            temp=temp.right;
        }
        temp.right=head;
        tail=temp;
        size--;
    }

    public void deleteAtIndex(int index){
        if (index<=0){
            deleteFirst();
            return;
        }
        if (index>=(size-1)){
            deleteLast();
            return;
        }
        CLLNode temp = head;
        for (int i = 0; i < (index-1); i++) {
            temp=temp.right;
        }
        CLLNode deleteNode = temp.right;
        temp.right=deleteNode.right;
        size--;
    }
    private class CLLNode {
        int val;
        CLLNode right;
        CLLNode(int val){
            this.val=val;
        }
    }

    @Override
    public String toString() {
        CLLNode temp = head;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < size; i++) {
            res.append(temp.val + " -> ");
            temp=temp.right;
        }
        res.append("END");
        return res.toString();
    }
}
