package abstraction;

public class abstractionintro {
    public static void main(String[] args) {
        
    }
}

abstract class Car {
    
    int price;


    abstract void start();

    void breaking(){
        System.out.println("breaking...");
    }

}

class Audi extends Car {

    @Override
    void start() {
      System.out.println("BMW starting");
        
    }

}

class BMW extends Car{

    @Override
    void start() {
        
        System.out.println("Audi starting");
    }  

}
