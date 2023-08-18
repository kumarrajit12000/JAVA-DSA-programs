import java.util.*;

// hybrid inheritance - single + multi + hierarchical inheritance
public class inheritance{
    public static void main(String args[]){
        Dolfin d1=new Dolfin();
        System.out.println("Dolfin");
        d1.eat();
        d1.breath();
        d1.swim();
        Shark s1=new Shark();
        System.out.println("Shark");
        s1.eat();
        s1.breath();
        s1.swim();
        Pikcock p1=new Pikcock();
        System.out.println("peacock");
        p1.eat();
        p1.breath();
        p1.fly();
        p1.color="green";
        System.out.println(p1.color);
        Human h1=new Human();
        System.out.println("human");
        h1.eat();
        h1.breath();
        h1.legs();
        h1.color="orange";
        System.out.println(h1.color);
    }
}
class Animals{
    String color;
     void eat(){
        System.out.println("Eats");
     }
     void breath(){
        System.out.println("breath");
     }
}
class Fish extends Animals{
     void swim(){
        System.out.println("swim");
     }
}
class Dolfin extends Fish{

}
class Shark extends Fish{

}

class Mammal extends Animals{
     void legs(){
     System.out.println("legs");
    }
}
class Dog extends Mammal {

}
class Human extends  Mammal {

}
class Bird extends Animals{
        void fly(){
            System.out.println("fly");
        }
}
class Pikcock extends Bird {

}
class koyal extends Bird{

}

