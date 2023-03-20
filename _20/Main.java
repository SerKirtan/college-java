package _20;
import java.util.Scanner;
public class Main {
    static int MAX = 10;
    static int stack[] = new int[MAX];
    static int top = -1;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        while(choice != 5){
            System.out.println("1] Push\n2] Pop\n3] Peep\n4] Display\n5] End\nEnter operation : ");
            choice = scan.nextInt();
            switch(choice){
            case 1:
                System.out.println("Enter element to push : ");
                int num = scan.nextInt();
                push(num);
                break;
            case 2:
                pop();
                break;
            case 3:
                peep();
                break;
            case 4:
                display();
                break;
            case 5:
                break;
            default : System.out.println("Please enter a valid number!");
            }
        }
    }   
    public static void push (int num){
        if(top == (MAX-1)){
            System.out.println("Stack overflow!");
        } else {
            stack[++top] = num;
        }
    }
    public static void pop(){
        if(top == -1){
            System.out.println("Stack underflow!");
        } else {
            System.out.println("Popped " + stack[top--] + " from stack!");
        }
    }
    public static void peep(){
        if(top == -1){
            System.out.println("Stack underflow!");
        } else {
            System.out.println("Element at top is " + stack[top]);
        }
    }
    public static void display(){
        if(top == -1){
            System.out.println("Stack underflow!");
        } else {
            for(int i = top ; i >= 0 ; i--){
                System.out.println(stack[i]);
            }
        }
    }
}