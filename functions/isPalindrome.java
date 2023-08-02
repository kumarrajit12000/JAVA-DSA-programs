import java.util.*;
public class isPalindrome {
    public static void isPalindrome(int n){
        int rev=0;
        int temp=n;
        while(temp!=0){
        int a=temp%10;
        rev=(rev*10)+a;
        temp=temp/10;
           }
           if(rev==n)
        {
            System.out.println("palindrome no");
        }
        else{
            System.out.println("not palindrome no");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isPalindrome(n); 
    }
   
    }
    

