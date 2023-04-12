package _28;

public class Sphere implements Shape3D {
    double radius , volume;
    public Sphere(double radius){
        this.radius = radius;
        this.volume = (4/3) * 3.141 * this.radius * this.radius;
    }
    public void display(){
        System.out.println("Radius = " + this.radius + "\nVolume = " + this.volume);
    }
}
