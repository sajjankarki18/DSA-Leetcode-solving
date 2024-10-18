package OOOPS_1;

public class final_keyword {
    public static void main(String[] args) {
        //Using the final keyword you can prevent your content to be modified

        final int number = 10;
       //number = 20; here when a data type is declared as a final it cannot be modified again

         final Student3 st = new Student3("sajan");
         //here student can be final because the objects are non-primitive data-type
        //so i can be modified
        st.name = "new name";

        System.out.println(st.name);

        //but cannot be reinitialized
//        st = new Student3("new object"); //throws an error

    }
}

class class_a{
//    final int number; //note that final variable should be initialized

}

class Student3{
    String name;

    public Student3(String name){
        this.name = name;
    }
}