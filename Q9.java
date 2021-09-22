enum Car {
    lamborghini(900),tata(20),audi(50),fiat(15),honda(12);
    private int price;
    Car(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
public class Q9 {
    public static void main(String args[]){
        System.out.println("All car prices:");
        for (Car c : Car.values()) {
            System.out.println(c + " costs " + c.getPrice() + " lakh Rs");
        }
    }
}