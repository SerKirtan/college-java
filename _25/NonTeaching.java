package _25;

import java.util.Scanner;

public class NonTeaching extends Employee{
    String typeOfWork;
    public void set(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter type of work : ");
        this.typeOfWork = scan.nextLine();
        super.set();
    }
    @Override
    public String toString(){
        return "\nNon teaching -> "+ this.typeOfWork + "Name : " + this.name + "\nEmployee no : " + this.empno + "\nAge : " + this.age + "\nSalary : " + this.salary;
    }
}
