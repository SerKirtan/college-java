package _4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = scan.nextInt();
        if(num < 1){
            System.out.println("Invalid number");
        } else {
            int i;
            for(i = 2 ; i < num ; i++){
                if(num % i == 0){
                    System.out.println(num + " is not a prime number");
                    break;
                }
            }
            if(i == num) System.out.println(num + " is a prime number");
        }
    }
}