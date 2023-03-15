package _1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    
        double a, b, c, d, e, f;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values of a, b, c, d, e & f : ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        d = scan.nextDouble();
        e = scan.nextDouble();
        f = scan.nextDouble();

        if( (a*d - b*c) == 0){
            System.out.println("The equation has no solution");
        } else {
            double x = ((e*d) - (b*f)) / ((a*d) - (b*c));
            double y = ((a*f) - (e*c)) / ((a*d) - (b*c));
            System.out.println("X = " + x + ", Y = " + y);
        }
    }
}
