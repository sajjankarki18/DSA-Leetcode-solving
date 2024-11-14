package Linked_Lists;

public class doublylinkedlist {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(23);
        list.insertLast(100);
        list.insertFirst(34);
        list.insertLast(120);
        list.intsertAtSpecificIndex(2, 150);
        list.intsertAtSpecificIndex(4, 500);

        list.reverseLinkedList();
        list.displayList();
    }
}

class DLL{
    Node head;
    Node tail;
    int size;

    public DLL(){
        this.size = 0;
    }

    //insert at first index of the list
    public void insertFirst(int value){
        Node node = new Node(value);

        if (head == null){
            head = node;
            tail = node;
        }else {
            node.next = head;
            head.prev = node;
            head = node;
        }

        size++;
    }

    //insert at last index of the list
    public void insertLast(int value){
        Node node = new Node(value);

        if (tail == null){
            tail = node;
            head = node;
        }else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

        size++;
    }

    //insert an element at specific index
    public void intsertAtSpecificIndex(int index, int value){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        if (index == 0){
            insertFirst(value);
            return;
        }

        if (index == size - 1){
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i=1;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next, temp.prev);
        temp.next = node;
        node.prev = temp;

        size++;
    }

    //remove first element in the list
    public int removeFirst(){
        int value = head.value;
        head = head.next;
        head.prev = null;

        size--;
        return value;
    }

    //remove last element in the list
    public int removeLast(){

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
        curr.prev = null;
        prev.next = null;

        size--;
        return value;
    }

    //remove from index
    public int removeIndex(int index){
        if (index < 0 && index > size){
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

        for (int i=0;i<=index - 1;i++){
            prev = curr;
            curr = curr.next;
        }

        int value = curr.value;
        prev.next = curr.next;
        curr.prev = prev.next;

        size--;

        return value;
    }

    //display the list
    public void displayList(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    //reverse a linked list
    public void reverseLinkedList(){
        Node node = head;
        Node last = null;

        while (node != null){
            last = node;
            node = node.next;
        }

        while (last != null){
            System.out.print(last.value + " <->");
            last = last.prev;
        }

        System.out.println("Reversed List");
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }

        Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
