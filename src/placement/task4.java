package task4;

public class Employee {
    String name;
    double basicSalary;
    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        double hra = 0.20 * basicSalary; // 20% of basic
        double da = 0.10 * basicSalary; // 10% of basic
        return basicSalary + hra + da;
    }

    
    void display() {
        double totalSalary = calculateSalary();
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Total Salary: " + totalSalary);
    }

    
    public static void main(String[] args) {
        Employee emp = new Employee("John", 20000);
        emp.display();
    }
}

method overloading
public class OverloadExample {

    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        int intResult = obj.sum(10, 20);
        System.out.println("Sum of integers: " + intResult);
        double doubleResult = obj.sum(10.5, 20.75);
        System.out.println("Sum of doubles: " + doubleResult);
    }
}


import java.util.Scanner;

class Student {
    int id;
    String name;
    int mark1, mark2, mark3;

    void createStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        id = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
    }

    void assignMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mark 1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter Mark 2: ");
        mark2 = sc.nextInt();
        System.out.print("Enter Mark 3: ");
        mark3 = sc.nextInt();
    }

    void displayResult() {
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;
        System.out.println("\n--- Student Result ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}

public class SimpleStudentSystem {
    public static void main(String[] args) {
        Student s = new Student();

        s.createStudent();
        s.assignMarks();
        s.displayResult();
    }
}
