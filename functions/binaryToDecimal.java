import java.util.*;
public class binaryToDecimal {
    public static void binaryToDecimal(int n){
        int dec=0,pow=0,Ld;
        while(n>0){
        Ld=n%10;
        dec=dec+(Ld*(int)Math.pow(2, pow));
        n=n/10;
        pow++;
         }
    System.out.println("binary of no is: "+ dec);
 
    
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        binaryToDecimal(n);
    
    }    
}
