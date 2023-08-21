import java.util.*;
public class CheckStringPalindrome {
    public static boolean CheckStringPalindrome(String str){
        int n=str.length();
        for(int i=0;i<=n/2;i++){
            
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str="popepop";
        System.out.println(CheckStringPalindrome(str)); 
    }   
}
