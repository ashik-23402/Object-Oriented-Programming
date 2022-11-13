package encapsulation;

public class EncapsulationIntro {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setprice(50);
        
    }

    private void dowork(){
        System.out.println("i am working");
    }
}

class Laptop{
    int ram;
    private int price;

    public void setprice(int price) {
        this.price = price;
        
    }
}
