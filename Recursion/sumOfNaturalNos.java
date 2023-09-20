import java.util.*;

public class sumOfNaturalNos {
    public static int calcsum(int n){
        
        if(n == 1){
             return 1;
           }
          
          int sum=n+calcsum(n-1);;
        
           return sum;

}
public static void main(String args[]){
    int n=6;
  System.out.println( calcsum(n)); 
}
}