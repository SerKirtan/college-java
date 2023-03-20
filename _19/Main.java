package _19;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the matrix (rows & coloumns) : ");
        int rows = scan.nextInt();
        int coloumns = scan.nextInt();
        int arr1[][] = new int[rows][coloumns];
        int arr2[][] = new int[rows][coloumns];
        int arrSum[][] = new int[rows][coloumns];
        System.out.println("Enter matrix-1 elements : ");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < coloumns ; j++){
                arr1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter matrix-2 elements : ");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < coloumns ; j++){
                arr2[i][j] = scan.nextInt();
                arrSum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of the matrices :");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < coloumns ; j++){
                System.out.print(" " + arrSum[i][j]);
            }
            System.out.println();
        }
    }
}
