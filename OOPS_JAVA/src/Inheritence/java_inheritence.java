package Inheritence;

public class java_inheritence {
    public static void main(String[] args) {
        Mouse2 m2 = new Mouse2();
        m2.leftClick();
        m2.rightClick();
    }
}

class Mouse1{
    String texture = "Matte";

    public void leftClick(){
        System.out.println("click");
    }
    public void rightClick(){
        System.out.println("click");
    }

    public void scrollUp(){
        System.out.println("scroll up!");
    }

    public void scrollDown(){
        System.out.println("scroll down!");
    }

    public void setColor(String color){
        System.out.println(color);
    }
}

class Mouse2 extends Mouse1{
    public void connect(){
        System.out.println("connected");
    }
}

class Mouse3 extends Mouse1{

    boolean ambidextorous = true;

}



