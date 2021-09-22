public class Bank {
    double getDetails(){
       return 0;
    }
    public static void main(String[] args){
     SBI obj1 = new SBI();
     BOI obj2 = new BOI();
     ICICI obj3 = new ICICI();
     System.out.println("Sbi bank rate of interest is: "+obj1.getDetails());
        System.out.println("BOI bank rate of interest is: "+obj2.getDetails());
        System.out.println("Icici bank rate of interest is: "+obj3.getDetails());
}
}
 class SBI extends Bank{
    private double rateOfInt = 4.5;
    double getDetails(){
 return rateOfInt;
    }
 }
class BOI extends Bank{
    private double rateOfInt = 5.0;
    double getDetails() {

        return rateOfInt;
    }
}
class ICICI extends Bank{
    private double rateOfInt = 3.5;
    double getDetails(){
        return rateOfInt;
    }
}

