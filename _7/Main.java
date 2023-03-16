package _7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = scan.nextLine();
        int length = str.length();
        System.out.println("Length of the string : " + length);
        System.out.println("Second half string   : " + str.substring(length/2)); 
    }
}