import java.util.*;
public class decimalToBinary{
    public static void DecToBin(int n){
       int bin=0,pow=0,rem;
       while(n>0){
        rem=n%2;
        bin= (int) (bin+rem*Math.pow(10, pow));
        pow++;
        n=n/2;
       }
       System.out.println(bin);
        
    }
    public static void main(String  args []){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        DecToBin(n);
    }
}

