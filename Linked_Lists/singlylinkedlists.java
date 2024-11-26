package Linked_Lists;

public class singlylinkedlists {
    public static void main(String[] args) {
        SLL list = new SLL();

        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(21);
        list.insertLast(100);

        list.displayList();
    }
}

class SLL{

    Node head;
    Node tail;

    int size;

    public SLL(){
        this.size = 0;
    }

    //method to insert at first index at singly linked lists
    public void insertFirst(int value){
        Node node = new Node(value);

        if (tail == null){
            head = node;
            tail = node;
            return;
        }

        node.next = head;
        head = node;

        size++;
    }

    //insert an element at last index
    public void insertLast(int value){
        Node node = new Node(value);

        if (tail == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        tail = node;

        size++;
    }

    //insert a value at specific index
    public void insertAtSpecificIndex(int value, int index){
        if (index < 0 && index > size){
            throw new IndexOutOfBoundsException();
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
        for (int i=0;i<index - 1;i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    //remove first element from the list
    public int removeFirst(){
        int value = head.value;
        head = head.next;

        size--;

        return value;
    }

    //remove last element of the list
    public int removeLast(){

        //first check weather there exist only single element in the list
        if (head.next == null){
            int value = head.value;
            head = null;
            tail = null;

            size--;

            return value;
        }

        Node curr = head;
        Node prev = null;

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

    //remove at specifc index
    public int removeAtSpecifcIndex(int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }

        if (index == 0){
            return removeFirst();
        }

        if (index == size){
            return removeLast();
        }

        Node curr = head;
        Node prev = null;

        for (int i=0;i<=index-1;i++){
            prev = curr;
            curr = curr.next;
        }

        int value = curr.value;
        prev.next = curr.next;

        size--;

        return value;
    }

    //display the list
    public void displayList(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
