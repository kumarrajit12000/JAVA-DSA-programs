import java.util.*;
public class HoloRhombus {
    public static void HoloRhombus(int n,int m){
        for(int i=1;i<=n;i++){
         
            for(int j=1;j<=n-i;j++){
            System.out.print(" ");
            }
    
         for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                     }            
            System.out.println(" ");
                    }
       
    }
    public static void main(String args[]){
        HoloRhombus(4, 5);
    }
}

