import java.util.*;
public class TilingProblem {
    public static int calcways(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        return calcways(n-2);
    } 
    public static void main(String args[]){
        System.out.println( calcways(4));
    }   
}
