package _34;

public class Loan {
    double amount;
    Date dueDate;
    public Loan(double amount , Date d){
        this.amount = amount;
        this.dueDate = d;
    }
    @Override
    public String toString(){
        return "\nLoan amount : " + this.amount + " , Due date :" + this.dueDate;
    }
}
