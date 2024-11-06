package Inheritence;

public class Question_13 {
    public static void main(String[] args) {
        Course [] courses = {
          new Course("Harvard", "USA", "Comp-sci", 499, 48),
          new Course("Oxward", "UK", "Business", 900, 28),
        };

        displayCourses(courses);
    }

    public static void displayCourses(Course [] courses){
        for (Course course: courses){
            course.displayInfo();
            System.out.println("------");
        }
    }
}

class University{
    String universityName;
    String location;

    public University(String universityName, String location){
        this.universityName = universityName;
        this.location = location;
    }

    public void displayInfo(){
        System.out.println("University: "+ universityName);
        System.out.println("Location: "+ location);
    }
}

class Course extends University{
    String courseName;
    int courseCode;
    int credits;

    public Course(String universityName, String location, String courseName, int courseCode, int credits){
        super(universityName, location);
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.credits=credits;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Couse Name: "+ courseName);
        System.out.println("Course code: "+ courseCode);
        System.out.println("Credits: "+ credits);
    }
}
