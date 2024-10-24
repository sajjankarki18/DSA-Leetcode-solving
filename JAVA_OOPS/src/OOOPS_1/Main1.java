package OOOPS_1;

public class Main1 {
    public static void main(String[] args) {
        //Student st = new Student();
        //Student st -> complile time
        //new Student() -> run time

        //The new keyword is dynamic memory allocation which is used for creating objects

        Student st = new Student();
        System.out.println(st.name);
        System.out.println(st.roll_no);
        System.out.println(st.marks);
    }
}

//The classes are the template of the objects and the objects are instance of the class

class Student{

    int roll_no = 10;
    String name = "sajan karki";
    float marks = 90.9f;

}
