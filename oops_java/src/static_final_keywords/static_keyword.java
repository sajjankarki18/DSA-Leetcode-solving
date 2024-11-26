package static_final_keywords;

import java.util.Stack;

public class static_keyword {
    public static void main(String[] args) {
        printMessage();

        //anything that is not declared as a static method cannot be used inside the static main class
       // printMessage2(); -> this method returns an error because the method is non-static

        //how to access these non-static methods
        //we will create an objects referencing those non-static variables
        static_keyword staticKeyword = new static_keyword();
        staticKeyword.printMessage2();
        //this is how we handle non-static methods by creating objects referencing to it
    }

    public static void printMessage(){
        System.out.println("i love java programming");
    }

    public void printMessage2(){
        System.out.println("i am a java developer");

    }
}
