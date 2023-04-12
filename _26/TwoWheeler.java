package _26;

public class TwoWheeler extends Vehicle{
    String name , model;
    int price , year;
    public TwoWheeler(){
        this.NoOfWheels = 2;
    }
    public TwoWheeler(String name , String model , int price , int year){
        this.name = name;
        this.model = model;
        this.price = price;
        this.year = year;
    }
    @Override
    public String toString(){
        return "\nTwo wheeler :- \n Name = " + this.name + "\n Model = " + this.model + "\n Price = " + this.price + "\n Launch = " + this.year;
    }
}
