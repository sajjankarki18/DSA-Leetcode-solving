package OOOPS_1;

public class contructors {
    public static void main(String[] args) {

        Student1 st2 = new Student1(12, "sajan karki", 98.9f);
        System.out.println(st2.roll_no);
        System.out.println(st2.name);
        System.out.println(st2.marks);

        Student1 st = new Student1();
        System.out.println(st.name);
        System.out.println(st.marks);
        System.out.println(st.roll_no);

        //There are two constructors one is default and other is paramerterized -> This is called as constructor overloading
        //in case i remove the default constructor the default will be replaced by by the parameterized contructor
    }
}

class Student1{
    int roll_no;
    String name;
    float marks;

    Student1(){
        this.roll_no = 8;
        this.name = "abc";
        this.marks = 100.0f;
    }

    Student1(int roll_no, String name, float marks){
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

}
