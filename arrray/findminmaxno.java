import java.util.*;
import java.lang.Math;
public class findminmaxno {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int size=sc.nextInt();
        int nos[]=new int[size];

        System.out.println("enter values:");
        for(int i=0;i<size;i++){
            nos[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                int temp=0;
                if(nos[i]>nos[j]){
                    temp=nos[i];
                    nos[i]=nos[j];
                    nos[j]=temp;
                 }
                 
            
            }        
        

            System.out.println(nos[i]);
        
        
        }

        System.out.println("min value is "+nos[0]);
        System.out.println("max value is "+nos[size-1]);



    }    
}