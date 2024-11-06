package Inheritence;

public class Question_11 {
    public static void main(String[] args) {
        Teacher [] teachers = {
          new Teacher("Mathematics", 50000, "New era school", "bhairahawa"),
          new Teacher("computer science", 150000, "sun shine", "bhairahawa"),
          new Teacher("accounting", 10000, "sai global", "bhairahawa"),
        };

        displayTeachersInformation(teachers);
    }

    public static void displayTeachersInformation(Teacher [] teachers){
        for (Teacher teacher: teachers){
            teacher.schoolInfo();
        }
    }
}


class School{
    String schoolName;
    String address;

    public School(String schoolName, String address){
        this.schoolName = schoolName;
        this.address = address;
    }

    public void schoolInfo(){
        System.out.println("SchoolName: "+ schoolName);
        System.out.println("Address: "+ address);
    }
}

class Teacher extends School{
    String subject;
    int salary;

    public Teacher(String subject, int salary, String schoolName, String address){
        super(schoolName, address);
        this.subject = subject;
        this.salary = salary;
    }

    public void schoolInfo(){
        super.schoolInfo();
        System.out.println("Subject: "+ subject);
        System.out.println("Salary"+ salary);
    }
}