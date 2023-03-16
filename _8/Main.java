package _8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=new String();
        System.out.println("Enter a line:");
        s=scan.nextLine();
        char c;
        int ct=0;
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c>=65 && c<=90)
            {
                ct++;

            }
        }
        System.out.println("total  number of words start with capital letters are :"+ct);
    }
}