package _26;

public class FourWheeler extends Vehicle {
    String name , model;
    int price , year;
    public FourWheeler(){
        this.NoOfWheels = 4;
    }
    public FourWheeler(String name , String model , int price , int year){
        this.name = name;
        this.model = model;
        this.price = price;
        this.year = year;
    }
    @Override
    public String toString(){
        return "\nFour wheeler :- \n Name = " + this.name + "\n Model = " + this.model + "\n Price = " + this.price + "\n Launch = " + this.year;
    }
}
