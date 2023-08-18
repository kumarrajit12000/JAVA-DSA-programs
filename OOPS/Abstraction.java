import java.util.*;
public class Abstraction {
    public static void main(String args[]){
        wildAnimals wa= new wildAnimals();
        wa.eat();
        human h= new human();
        h.eat();
    }    
}
abstract class Animal{
    
    void walk(){
        System.out.println("walks");
    }
    abstract void eat();
} 
class wildAnimals extends Animal{
    void eat(){
        System.out.println("eats meat");
    }
}
class human extends Animal{
    void eat(){
        System.out.println("eats vegitables");
    }
}
