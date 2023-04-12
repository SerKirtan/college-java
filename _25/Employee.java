package _25;
import java.util.Scanner;
public class Employee {
    String name;
    int empno , age;
    float salary;
    static int empno_gen = 1;

    public Employee(){
        this.empno = Employee.empno_gen++;
    }

    public Employee(String name , int age , float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.empno = Employee.empno_gen++;
    }
    public void set(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee name : ");
        this.name = scan.nextLine();
        System.out.println("Enter age and salary : ");
        this.age = scan.nextInt();
        this.salary = scan.nextFloat();
    }
    @Override
    public String toString(){
        return "Name : " + this.name + "\nEmployee no : " + this.empno + "\nAge : " + this.age + "\nSalary : " + this.salary;
    }
}
