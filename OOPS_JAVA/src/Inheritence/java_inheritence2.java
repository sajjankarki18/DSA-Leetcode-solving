package Inheritence;

public class java_inheritence2 {
    public static void main(String[] args) {
        getCalculation calculation = new getCalculation();
        calculation.printMessage();
        calculation.getAdd();
        calculation.getMul();
        calculation.getSub();
    }
}

class calculate{
    int a = 100;
    int b = 200;
    int c = 200;

    public void getAdd(){
        System.out.println(a + b + c);
    }

    public void getSub(){
        System.out.println(a - b- c);
    }

    public void getMul(){
        System.out.println(a * b * c);
    }

}

class getCalculation extends calculate{
    public void printMessage(){
        System.out.println("Parent method called");
    }
}

