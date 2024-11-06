package Inheritence;

public class Questions_5 {
    public static void main(String[] args) {
        Manager manager = new Manager("backend", "sajan karki", 150000);
        manager.showDetails();
    }
}

class Employee{
    String name;
    double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void showDetails(){
        System.out.println("Name: "+ name + " Salary: "+ salary);
    }
}

class Manager extends Employee{
    String department;

    public Manager(String department, String name, double salary){
        super(name, salary);
        this.department = department;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("Department: "+ department);
    }
}

