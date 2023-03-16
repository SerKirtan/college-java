package _11;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(49) + 1;
        System.out.println(num);
    }
}
