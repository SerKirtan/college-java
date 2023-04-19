package _33;
import java.util.LinkedList;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        int check = 0;
        while(check != 4){
            int data , position;
            System.out.println("1] Insert\n2] Remove \n3] Display\n4] End\nEnter opeartion : ");
            check = scan.nextInt();
            switch(check){
            case 1:
                System.out.println("Which element do you want to insert : ");
                data = scan.nextInt();
                System.out.println("Where do you want to insert : ");
                position = scan.nextInt();
                ll.add(position, data);
                break;
            case 2:
                System.out.println("From where do you want to remove : ");
                position = scan.nextInt();
                ll.remove(position);
                break;
            case 3:
                System.out.println(ll);
                break;
            case 4:
                break;
            default:  
                System.out.println("Invalid input. Please try again");
            }
        }
    }
}
