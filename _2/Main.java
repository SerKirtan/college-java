package _2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight (in pounds) and height (in inches) : ");
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
        double bmiIndex = (.45359237 * weight) / (.0254 * height * 0.0254 * height);
        System.out.println("Your BMI is : " + bmiIndex);
    }
}