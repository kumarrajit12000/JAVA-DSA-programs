import java.util.*;
public class Print_no_decresing_order {

    public static void printno(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
         n--;
        printno(n);
    }

    public static void main(String args[]){
        int n=10;
        printno(n);

}
}