package _24;
public class Main {
    public static void main(String[] args){
        Employee[] emp = new Employee[10];

        for(int i = 0 ; i < 10 ; i++){
            emp[i] = new Employee("Unknown", 21, 10000);
        }
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Employee-" + (i+1) + " information\n" + emp[i]);
        }
    }

}
