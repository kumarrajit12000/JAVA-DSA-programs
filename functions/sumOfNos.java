import java.util.*;
public class sumOfNos{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int no = sc.nextInt();
        int sum=0;
    while(no>0){
        int r =no%10;
        sum=sum+r;
        no=no/10;
    }
    System.out.println("sum of nos" + sum);
    }
}
