package _34;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws Exception{
        Circle c = new Circle(2.1);
        Date d = new Date(17, 10, 2023);
        Loan l = new Loan(38932.32, d);
        StringX s = new StringX("Unknown");
        ArrayList<Object> arr = new ArrayList<>();
        arr.add(c);
        arr.add(d);
        arr.add(l);
        arr.add(s);
        for(Object e : arr){
            System.out.println(e);
        }
    }
}
