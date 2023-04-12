package _25;

public class Main {
    public static void main(String[] args){
        Teaching t1 = new Teaching();
        Teaching t2 = new Teaching();
        NonTeaching t3 = new NonTeaching();
        NonTeaching t4 = new NonTeaching();
        t1.set();
        t2.set();
        t3.set();
        t4.set();
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
}
