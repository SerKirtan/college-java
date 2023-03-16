package _12;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        Random random = new Random();
        String str = "";
        for(int i = 0 ; i < 3 ; i++){
            char c = (char) ('A' + random.nextInt(26));
            str += c;
        }
        int num = random.nextInt(8999) + 1000;
        System.out.println("Number plate : " + str + " " + num);
    }
}
