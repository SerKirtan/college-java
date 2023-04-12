package _23;

public class Circle {
    double radius;
    double area;
    public Circle(int radius){
        this.radius = radius;
        this.area = this.radius * this.radius * 3.141;
    }
    public Circle(double radius){
        this.radius = radius;
        this.area = this.radius * this.radius * 3.141;
    }
    void display(){
        System.out.println("Circle radius : " + this.radius + " , Area = " + this.area);
    }
}
