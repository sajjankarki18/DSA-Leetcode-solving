package Linked_Lists;

public class singlylinkedlists {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(20);
        list.insertFirst(25);
        list.insertFirst(10);
        list.insertLast(100);
        list.insertLast(150);

        list.display();
    }
}

class SLL{
    Node head;
    Node tail;
    int size;

    public SLL(){
        this.size = 0;
    }

    //method to insert at first
    public void insertFirst(int value){
        if (tail == null){
            tail = head;
        }

        Node node = new Node(value);
        node.next = head;
        head = node;

        size++;
    }

    //method to insert element at last
    public void insertLast(int value){
        if (tail == null){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    //method to insert at specific index
    public void insertAtSpecificIndex(int value, int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of Bound error!");
        }

        if (index == 0){
            insertFirst(value);
            return;
        }

        if (index == size){
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    //method to remove first element
    public int removeFirst(){
        if (head == null){
            tail=null;
        }
        
        int value = head.value;
        head = head.next;

        size--;

        return value;
    }

    //method to remove last element
    public int removeLast(){
        Node curr = head;
        Node prev = null;

        if (head.next == null){
            int value = head.value;
            head = null;
            tail = null;

            size--;
            return value;
        }

        while (curr.next != null){
            prev = curr;
            curr = curr.next;
        }

        int value = curr.value;
        prev.next = null;
        tail = prev;
        size--;

        return value;
    }

    //method to remove an index
    public int removeIndex(int index){

        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of Bound error!");
        }

        if (index == 0){
            return removeFirst();
        }

        if (index == size - 1){
            return removeLast();
        }

        Node curr = head;
        Node prev = null;

        for (int i=0;i<index;i++){
            prev = curr;
            curr = curr.next;
        }

        int value = curr.value;
        prev.next = curr.next;
        size--;

        return value;
    }

    //method to display the list
    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("end of the lists");
    }

    private class Node{
        private int value;
        private Node next;

        Node(int value, Node next){
            this.value= value;
            this.next = next;
        }

        Node(int value){
            this.value = value;
        }
    }
}
