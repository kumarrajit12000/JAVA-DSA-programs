import java.util.*;
public class rerversearrayElements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int size=sc.nextInt();
        int nos[]=new int[size];

        System.out.println("enter values:");
        for(int i=0;i<size;i++){
            nos[i]=sc.nextInt();
        }

        for(int i=size-1;i>=0;i--){

            System.out.println("reverse of array is:"+nos[i]);
        }


    }
}
