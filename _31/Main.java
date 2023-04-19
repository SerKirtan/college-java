package _31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a binary number : ");
        String binary = scan.nextLine();

        for(int i = 0 ; i < binary.length() ; i++){
                if(binary.charAt(i) != '1' && binary.charAt(i) != '0'){
                    throw new Exception("NumberFormatException");
                }
        }
        int decimal = bin2Dec(binary);
        System.out.println("String in decimal = " + decimal);
    }

    public static int bin2Dec(String binary){
        int sum = 0;
        int length = binary.length()-1;
        for(int i = 0 ; i <= length ; i++){
            if(binary.charAt(i) == '1'){
                int temp = 1;
                for(int j = 0 ; j < (length - i) ; j++){
                    temp *= 2;
                }
                sum += temp;
            }
        }
        return sum;
    }
}
