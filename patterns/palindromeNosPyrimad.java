import java.util.*;
public class palindromeNosPyrimad {  
    public static  void palindromeNosPyrimad(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print nos
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            if(i==1){
                System.out.print(" ");
            }
            else{
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
            }
            System.out.println(" ");
        }
    }    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        palindromeNosPyrimad(n);
    }
}
