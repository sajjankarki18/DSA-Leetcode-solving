package Linked_Lists;

public class doublylinkedlists {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(100);
        list.insertFirst(20);
        list.insertFirst(34);
        list.insertLast(150);

        list.removeIndex(3);
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

    //insert first index in the list
    public void insertFirst(int value){
        Node node = new Node(value);

        if (tail == null){
            head = node;
            tail = node;
            return;
        }

        node.next = head;
        head.prev = node;
        head = node;

        size++;
    }

    //insert last index in the list
    public void insertLast(int value){
        Node node = new Node(value);
        if (tail == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;

        size++;
    }

    //insert at specifc index of the list
    public void insertAtSpeificIndex(int value, int index){
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
        for (int i=0;i<index-1;i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next, temp.prev);
        temp.next = node;
        node.prev = temp;

        size++;
    }

    //remove first index of the list
    public int removeFirst(){
        int value = head.value;
        head = head.next;

        size--;
        return value;
    }

    //remove last index of the list
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

    //remove at specific position in the list
    public int removeIndex(int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }

        if (index == 0){
            return removeFirst();
        }

        if (index == size){
            return removeLast();
        }

        Node temp = head;

        for (int i=0;i<=index - 1;i++){
            temp = temp.next;
        }

        int value = temp.value;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
        return value;
    }

    //display the lists
    public void displayList(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}

