package _6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter : ");
        char c = scan.next().charAt(0);
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': 
                System.out.println("Entered letter is a vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}