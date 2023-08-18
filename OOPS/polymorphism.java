import java.lang.reflect.Method;
import java.util.*;
public class polymorphism {
    public static void main(String args[]){
        Method_overloading mo=new Method_overloading();
        System.out.println( mo.sum("rajit", "kumar"));
        System.out.println( mo.sum(1.2f, 2.5f));
        System.out.println( mo.sum(5, 10));
        System.out.println( mo.sum(5, 10, 15)); 


        overriding or=new overriding();
      System.out.println( or.displaySum(2,3,4)); 


    }    
}
class Method_overloading{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    String sum(String a,String b){
        return a+b;
    }
}

class method_overriding {
    int  displaySum(int a,int b){
        return a+b;
        
    }
}
class overriding extends method_overriding{
    int displaySum(int a,int b,int c){
        return a+b+c;
    }
}