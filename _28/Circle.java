package _28;

public class Circle implements Shape2D {
    double radius, area;
    public Circle(double radius){
        this.radius = radius;
        this.area = 3.141 * this.radius * this.radius;
    }
    public void display(){
        System.out.println("Radius = " + this.radius + "\nArea = " + this.area);
    }
}
