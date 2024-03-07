package DSA.linkedlist;

public class DoubleLL {
    DLLNode head,tail;
    int size;
    DoubleLL(){
        head=null;
        tail=null;
        size=0;
    }
    public void insertAtStart(int value){
        DLLNode node = new DLLNode(value);
        if (head==null){
            node.right=null;
            node.left=null;
            head=node;
            tail=node;
            size++;
            return;
        }
        node.left=null;
        node.right=head;
        head.left=node;
        head=node;
        size++;
    }

    public void insertAtEnd(int value){
        DLLNode node = new DLLNode(value);
        if (tail==null){
            node.right=null;
            node.left=null;
            head=node;
            tail=node;
            size++;
            return;
        }
        node.left=tail;
        node.right=null;
        tail.right=node;
        tail=node;
        size++;
    }

    public void insertAtIndex(int value,int index){
        if (index<=0){
            insertAtStart(value);
            return;
        }
        if (index>=size){
            insertAtEnd(value);
            return;
        }
        DLLNode temp = head;
        for (int i = 0; i < (index-1); i++) {
            temp=temp.right;
        }
        DLLNode node = new DLLNode(value);
        node.left=temp;
        node.right=temp.right;
        temp.right=node;
        temp=temp.right;
        temp.left=node;
        size++;
    }

    public void deleteFirst(){
        if (size==1){
            head=null;
            tail=null;
            size--;
            return;
        }
        head=head.right;
        head.left=null;
        if (size==2){
            head.right=null;
        }
        size--;
    }

    public void deleteLast(){
        if (size==1){
            head=null;
            tail=null;
            size--;
            return;
        }
        tail=tail.left;
        tail.right=null;
        if (size==2){
            tail.left=null;
        }
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

        DLLNode temp = head;
        for (int i = 0; i < (index-1); i++) {
            temp=temp.right;
        }
        DLLNode deleteNode = temp.right;
        DLLNode nextNode = deleteNode.right;
        temp.right=deleteNode.right;
        nextNode.left=temp;
        deleteNode.right=null;
        deleteNode.left=null;
        deleteNode=null;
        size--;
    }

    public void display(){
        DLLNode temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.val+" <-> ");
            temp=temp.right;
        }
        System.out.println("End");

    }
    private class DLLNode{
        int val;
        DLLNode right,left;
        DLLNode(int val){
            this.val=val;
        }

    }

    @Override
    public String toString() {
        DLLNode temp = head;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < size; i++) {
            res.append(temp.val+" <-> ");
            temp=temp.right;
        }
        res.append("End");
        return res.toString();
    }


}
