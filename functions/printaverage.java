import java.util.*;
public class printaverage{

    public static void avg(){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         float avg;
         avg=(a+b+c)/3;
         System.out.println("avg is:"+avg);

    }
    public static void main(String args[]){

        avg();

    }




}