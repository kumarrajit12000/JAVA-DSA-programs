import java.util.*;
public class factorial {
    public static int calcFactorial(int n){
        
        if(n == 0){
             return 1;
           }
          
          int fact=n*calcFactorial(n-1);;
        
           return fact;

    }
    public static void main(String args[]){
        int n=5;
      System.out.println( calcFactorial(n)); 
    }
}
