import  java.util.*;
public class sumofoddnos {

    public static void sumofoddnos(){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sumodd=0;
        int sumeven=0;

        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sumeven=sumeven+i;       

            }
            else{
                sumodd=sumodd+i;
                
            }
        }
        System.out.println( " sum of even nos :" +sumeven);
        System.out.println(" sum of odd nos :" +sumodd);
        
    }

    public static void main(String args[])
    {
        sumofoddnos();
    }







    
}
