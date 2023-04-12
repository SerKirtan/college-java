package _24;
import java.util.Random;
public class Employee {
    String name;
    int empno , age;
    float salary;
    static int empno_gen = 1;

    public Employee(String name , int age , float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.empno = this.empno_gen++;
    }

    @Override
    public String toString(){
        return "Name : " + this.name + "\nEmployee no : " + this.empno + "\nAge : " + this.age + "\nSalary : " + this.salary;
    }
}
