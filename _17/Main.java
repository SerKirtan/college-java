package _17;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int arr[][] = new int[6][6];
        for(int i = 0 ; i < 6 ; i++){
            for(int j = 0 ; j < 6 ; j++){
                arr[i][j] = random.nextInt(2);
            }
        }
        for(int i = 0 ; i < 6 ; i++){
            for(int j = 0 ; j < 6 ; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
        for(int i = 0 ; i < 6 ; i++){
            for(int j = 0 ; j < 6 ; j++){
                if(arr[i][j] == 1){
                    System.out.println("Row-" + (i+1) + " has 1");
                    break;
                }
            }
        }
        for(int i = 0 ; i < 6 ; i++){
            for(int j = 0 ; j < 6 ; j++){
                if(arr[j][i] == 1){
                    System.out.println("Column-" + (i+1) + " has 1");
                    break;
                }
            }
        }
    }
}