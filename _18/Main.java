package _18;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array :- ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter all array elements : ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = scan.nextInt();
        }
        for(int i = 0 ; i < (size-1) ; i++){
            for(int j = (i+1) ; j < size ; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Sorted array elements : ");
        for(int e : arr){
            System.out.print(" " + e);
        }
   }
}