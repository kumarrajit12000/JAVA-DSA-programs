import java.util.*;
public class powerFn {
    public static int calPower(int x,int n){
        if(n == 1){
            return x;
        }

        return x * calPower(x, n-1);
    }    

    public static void main(String args[]){
      System.out.println(  calPower(2, 4));
    }
}
