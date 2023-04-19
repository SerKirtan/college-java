package _34;

public class Date {
    int day , month, year;
    public Date(int day , int month , int year) throws Exception{
        this.day = day; 
        this.month = month;
        this.year = year;
        if(this.checkInvalid()){
            throw new Exception("InvalidDateException");
        }
    }
    public boolean checkInvalid(){
        if ( this.year < 0 || this.year > 9999){
            return true;
        }
        switch(this.month){
            case 2: 
                if(year % 4 == 0){
                    if(day < 0 || day > 29){
                       return true;
                    }
                }
                else if( day < 0 || day > 28){
                    return true;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: 
                if(this.day < 0 || this.day > 31){
                    return true;
                }
                break;
            case 4: 
            case 6:
            case 9:
            case 11:
                if(day < 0 || day > 30){
                    return true;
                }
                break;
            default:
                return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "\nDate : " + this.day + "/" + this.month + "/" + this.year;
    }
}
