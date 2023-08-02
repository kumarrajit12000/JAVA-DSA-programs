import  java.util.*;
public class eligiblforvote {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
    
        if(a>=18){
            System.out.println("Eligible for vote ");
        }
        else{
            System.out.println("Not Eligible for vote");
        }
    }
}
