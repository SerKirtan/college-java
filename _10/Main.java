package _10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "abcdefghijkl";
        int n = str.length();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 , counter = 0 ; j < n ; j++){
                if((n-i-1) > j){
                    System.out.print(" ");
                } else {
                    char s = str.charAt(counter++);
                    System.out.print(" " + s);
                }
            }
            System.out.println("");
        }
    }
}