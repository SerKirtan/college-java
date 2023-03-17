package _13;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal number : ");
        String str = scan.nextLine();
        String parts[] = str.split("\\.");
        String tens = "1";
        for(int i = 0 ; i < parts[1].length();i++){
            tens += "0";
        }
        long real = Integer.valueOf(parts[0]);
        long fraction = Integer.valueOf(parts[1]);
        for(int i = 0 ; i < parts[1].length() ; i++) 
            real *= 10;
        long numerator = real + fraction;
        long denominator = 1;
        for(int i = 0 ; i < parts[1].length() ; i++) 
            denominator *= 10;

        for(int i = 2 ; i <= 37 ; i++){
            if(numerator % i == 0 && denominator % i == 0){
                numerator /= i;
                denominator /= i;
                i--;
            }
        }
        System.out.println("Fraction form is " + numerator + "/" + denominator);
    }
}
