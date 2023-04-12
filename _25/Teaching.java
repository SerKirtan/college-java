package _25;
import java.util.Scanner;
public class Teaching extends Employee{
    String nameOfSubject;
    public void set(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of subject : ");
        this.nameOfSubject = scan.nextLine();
        super.set();
    }
    @Override
    public String toString(){
        return "\nTeaching -> "+ this.nameOfSubject + "Name : " + this.name + "\nEmployee no : " + this.empno + "\nAge : " + this.age + "\nSalary : " + this.salary;
    }
}
