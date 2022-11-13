package Basics;

public class MainClass {
    
    public static void main(String[] args) {
        // System.out.println("hello world");

        Person person1 = new Person("ashik",24);
        // person1.age = 24;
        // person1.name = "ashik";

        System.out.println(person1.name +" "+ person1.age);

        person1.eat();
        person1.walk();

        person1.walk(5);
    }


}

class Person{
    String name;
    int age;

    Person(String name , int age){

        this.name = name;
        this.age = age;

    }


    void walk(){
        System.out.println(name +" "+ "is walking");
    }

    void eat(){
        System.out.println(name +" "+"is eating");
    }

    void walk(int step){
        System.out.println(name +" "+"wallkig"+" "+step);
    }
}



class Developer extends Person{

    Developer(String name, int age) {
        super(name, age);
        //TODO Auto-generated constructor stub
    }

    void walk(){
        System.out.println("developer " + name + " walking"); // runtime polymorphism
    }
    
}