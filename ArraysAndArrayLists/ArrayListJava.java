package ArraysAndArrayLists;

import java.util.ArrayList;

public class ArrayListJava {
    public static void main(String[] args) {
        //An arrayList is a class not a datatype
        ArrayList<Integer> list = new ArrayList<>(); //the parenthesis is the contructor of the arrayList
        list.add(10);
        list.add(45);
        list.add(21);
        list.add(90);

        list.set(2,100);

        System.out.println(list.contains(21));
        System.out.println(list.contains(91));

        System.out.println(list);
    }
}
