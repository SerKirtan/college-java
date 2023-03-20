package _16;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Enter 10 numbers : ");
        for(int i = 0 ; i < 10 ; i++){
            int num = scan.nextInt();
            String str = String.valueOf(num);
            String revStr = "";
            for(int j = 0 ; j < str.length(); j++){
                char ch = str.charAt(j);
                revStr = ch + revStr;
            }
            list.add(revStr);
        }
        System.out.println("Reverse :");
        for(String e : list){
            System.out.print(" " + e);
        }
    }
}