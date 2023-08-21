import java.util.*;
public class usernamefromemail{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter email");
        String email=sc.next();
        String username=" ";
        
        for(int i=0;i<email.length();i++){
            if( email.charAt(i) == '@'){
                break;
            }
            else{
                username+=email.charAt(i);
            } 
            
        }
        System.out.println("username is: "+username);

    }
}