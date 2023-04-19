package _34;

public class Circle {
    double radius , area;
    public Circle(double radius){
        this.radius = radius;
        this.area = radius * radius * 3.141;
    }
    @Override
    public String toString(){
        return "\nRadius of circle  = " + this.radius + " , Area = " + this.area;
    }
}
