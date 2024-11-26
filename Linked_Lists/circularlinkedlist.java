package Linked_Lists;

public class circularlinkedlist {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(21);
        list.insert(32);
        list.insert(78);

        list.displayList();
    }
}

class CLL{
    Node head;
    Node tail;
    int size;

    public CLL(){
        this.size = 0;
    }

    //insert method
    public void insert(int value){
        Node node = new Node(value);

        if (tail == null){
            head = node;
            tail = node;
            return;
        }

        node.next = head;
        tail.next = node;
        head = node;

        size++;
    }

    //remove a node from list
    public int remove(int value){

        //check if the the value is head itself and we should check if head is null first
        if (head != null && head.value == value){
            int val = head.value;
            head = head.next;
            tail.next = head;

            size--;

            return val;
        }

        Node curr = head;
        Node prev = null;

        while (curr != null){
            if (curr.value == value){
                int val = curr.value;
                prev.next = curr.next;

                size--;
                return val;
            }

           prev = curr;
           curr = curr.next;
        }

        return -1;
    }

    //display list
    public void displayList(){
        Node temp = head;

        if (head != null){
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            while (temp != head);
        }

    }
    public class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
