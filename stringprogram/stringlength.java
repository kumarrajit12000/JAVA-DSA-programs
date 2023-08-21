import java.util.*;
public class stringlength{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();

        String arr[]=new String[size];
        int arrlength=0;
        System.out.println("enter string:");
        for(int i=0;i<size;i++){
          arr[i]= sc.next();
         arrlength=arrlength+arr[i].length();
        }

    System.out.println("total string length is:"+arrlength);
    }

}