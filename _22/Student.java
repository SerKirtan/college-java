package _22;
import java.util.Scanner;
public class Student {
    String name;
    int rollno, total_marks;
    public Student(){
        name = "Unknown";
        rollno = 0;
        total_marks = 0;
    }
    public Student(String name , int rollno , int total_marks){
        this.name = name;
        this.rollno = rollno;
        this.total_marks = total_marks;
    }
    public void display(){
        System.out.println("Default constructor -> Student name = Unknown , Roll no = 0 & Total marks = 0");
        System.out.println("Parameterised constructor -> Student name = " + this.name + " , Roll no = " + this.rollno + " , Total marks = " + this.total_marks);
    }
}
