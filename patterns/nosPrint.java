import java.util.*;
public class nosPrint {
    public static void main(String agrs[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        int ch=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print(ch+" ");
                ch++;
                
            }
            System.out.println(" ");
        }
    
}}
