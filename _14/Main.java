package _14;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 2 ; i  <= num/2 ; i++){
            if(num % i == 0){
                arr.add(i);
                num /= i;
                i--;
            }
        }
        arr.add(num);
        System.out.println("Factors : ");
        for(int e : arr){
            System.out.print(e + ", ");
        }
    }
}