package classesAndObjects;

//Rectangle Class:
//
//Create a class Rectangle with fields length and breadth.
//Add methods to calculate and return the area and perimeter.
//Write a program to create two Rectangle objects and display their area and perimeter.

public class Question_2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(100, 100);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}

class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea(){
        System.out.println("The area of the reactanle is: "+ length * breadth);
    }

    public void calculatePerimeter(){
        int perimeter = 2 * (length + breadth);
        System.out.println("The perimter of the rectangle: "+ perimeter);
    }
}