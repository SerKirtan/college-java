package _15;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static int gcd(int num1 , int num2){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int GCD = 1;
        for(int i = 2  ; i <= (num1<num2 ? num1 : num2) ; i++){
            if(num1 % i == 0 && num2 % i == 0){
                arr.add(i);
                num1 /= i;
                num2 /= i;
                i--;
            }
        }  
        for (int e : arr){
            GCD *= e;
        }
        return GCD;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Greatest common divisor is " + gcd(num1, num2));
    }
}
