package OOPS_2;

public class Static2 {
    public static void main(String[]  args) {
        //this is how we access the non static variables by creating an object of it
        Static2 st = new Static2();
        st.sayHello();
    }

    public void sayHello(){
        System.out.println("hello world!");
        greetings();

        //but we can use the static variables inside the non static
    }

    public static void greetings(){
        System.out.println("hi! you look beutiful!");
    }
}

//so in simple terms we cannot use the non static without referencing the the instance of that object being created
