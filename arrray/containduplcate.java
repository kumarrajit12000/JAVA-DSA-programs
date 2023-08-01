import java.util.*;


public class  containduplcate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();       
        int nos[]=new int[size];

        System.out.println("enter nos:");

        for(int i=0;i<size;i++){
            nos[i]=sc.nextInt();

        }
        int temp=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){

                if(nos[i]>nos[j]){
                    temp=nos[i];
                    nos[i]=nos[j];
                    nos[j]=temp;
                 }
                 
             }
             System.out.println(nos[i]);
        }
             
            for(int i=0;i<size;i++){
                 for(int j=i+1;j<size;j++){
                {
                    if(nos[i]==nos[j]){
                        System.out.println("true");
                        
                    }
                    
                }
                
            }
            
           }
    System.out.println("false");
}}