import java.util.*;

public class Print_no_incresing_order {
    public static void printno(int n){
        
        if(n == 1){
            System.out.println(n);
            return;
        }
        
         printno(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
    int n=10;
        printno(n);
    }
}
