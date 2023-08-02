import java.util.*;
public class primeNosInSeries {
    public static boolean checkPrime(int n){
        
        boolean isprime=true;
         for(int i=2;i<n;i++){
            if(n%i==0){
            isprime=false;
            break;
            }
            
        }
        return isprime;
                
    }
    public static void primeseries(int n){
        for(int i=2;i<n;i++){
            if(checkPrime(i)){
                System.out.println(i);

            }
        }

    }

    private static boolean isPrime(int i) {
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // System.out.println(checkPrime(n)); 
       primeseries(n);

    }
}
