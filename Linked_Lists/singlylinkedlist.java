package Linked_Lists;

public class singlylinkedlist {
    public static void main(String[] args) {
        SinglyList list = new SinglyList();
        list.insertFirst(34);
        list.insertFirst(20);
        list.insertLast(56);
        list.insertLast(21);
        list.insertLast(20);

        list.displayList();
    }
}

class SinglyList{
    Node head;
    Node tail;

    int size;

    public SinglyList(){
        this.size = 0;
    }

    //insert an element at first index of the list
    public void insertFirst(int value){
        if (tail == null){
            tail = head;
        }

        Node node = new Node(value);
        node.next = head;
        head = node;

        size++;
    }

    //method to insert an element at last index
    public void insertLast(int value){
        //here we we need some base cases
        //when we directly try to insert a tail in an empty list it returns an null pointer exceptions

        Node node = new Node(value);

        //so if tail is null make both head and tail both to node
        //and then start the operations
        if (tail == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    //insert an element at specifc index
    public void insertAtSpecificIndex(int index, int value){
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
        for (int i=1;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    //remove the first element from the list
    public int removeFirst(){
        int value = head.value;
        head = head.next;

        size--;
        return value;
    }

    //remove the last element in the list
    public int removeLast(){

        //first check if there is only single element in the list
        if (head.next == null){
            int value = head.value;
            head = null;
            tail = null;

            size--;
            return value;
        }

        //else perform the operation to remove last element
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

    //remove from specific index
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

        Node prev = null;
        Node curr = head;

        for (int i=0;i<=index - 1;i++){
            prev = curr;
            curr = curr.next;
        }

        int value = curr.value;
        prev.next = curr.next;

        size--;

        return value;
    }

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

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        Node(int value){
            this.value = value;
        }
    }
}