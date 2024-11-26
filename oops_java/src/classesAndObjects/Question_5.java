package classesAndObjects;

public class Question_5 {
    public static void main(String[] args) {
        Student_grades [] students = {
                new Student_grades("sajan karki", 98),
                new Student_grades("ashok", 78),
                new Student_grades("karan", 87)
        };

        getStudentsGrade(students);
    }
    public static void getStudentsGrade(Student_grades [] students){
        for (Student_grades studentGrades: students){
            System.out.println(studentGrades.getName());
            studentGrades.getGrade();
            System.out.println("---------");
        }
    }
}

class Student_grades{
    private String name;
    private double marks;

    public Student_grades(String name, double marks){
        this.name = name;
        this.marks = marks;
    }

    public void getGrade(){
        if (marks > 90 && marks <= 100){
            System.out.println("Grade A");
        } else if (marks > 75 && marks <= 90) {
            System.out.println("Grade B");
        } else if (marks > 50 && marks <= 75) {
            System.out.println("Grade C");
        }else  if (marks > 35 && marks <= 50){
            System.out.println("Grade D");
        }else {
            System.out.println("FAIL");
        }
    }

    public String getName(){
        return name;
    }

    public double getMarks(){
        return marks;
    }
}
