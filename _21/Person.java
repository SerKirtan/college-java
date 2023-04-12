package _21;
import java.util.Scanner;
public class Person {
    String name;
    int age;
    float salary;

    public void set(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter person name :");
        this.name = scan.nextLine();
        System.out.println("Enter age : ");
        this.age = scan.nextInt();
        System.out.println("Enter salary : ");
        this.salary = scan.nextFloat();
    }
    public void display(){
        System.out.println("Person name : " + this.name + ", age : " + this.age + ", salary : " + this.salary);
    }
}
