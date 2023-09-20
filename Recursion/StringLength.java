import java.util.*;
public class StringLength {
    public static int calcLength(String str){
        if( str.length() == 0){
            return 0;    
            }
        
        return calcLength(str.substring(1)) + 1;

    }    
    public static void main(String args[]){
      System.out.println(  calcLength("rajitkumar"));
    }
}
