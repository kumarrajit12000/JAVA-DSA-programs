import java.util.*;
public class PrintDigitsInEnglish {
    public static void  PrintDigitsInEnglish(int no){
        String arr[]={"zero","one","two","three","four","five","six","seven","eigth","nine"};

        if(no == 0){
            return;
        }
        int ld = no % 10;
        PrintDigitsInEnglish(no/10);
        System.out.println( arr[ld] + " ");
    }
    public static void main(String args[]){
    PrintDigitsInEnglish(12345);        
    }
}
