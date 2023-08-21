import java.util.*;
public class StringAnagrams {
    public static void StringAnagrams(String str,String str1){
      
        if(str.length() == str1.length()){
            char str2[]=str.toCharArray();
            char str3[]=str1.toCharArray();
            Arrays.sort(str2);
            Arrays.sort(str3);
            if(Arrays.equals(str2,str3)){
                System.out.println("string are anagrams");
            }
            else{
                System.out.println("string are not anagrams");
            }
        }
        
        else{
            System.out.println("string are not anagrams");
        }
    }
    public static void main(String args[]){
        String str="race";
        String str1="care";
       
        
        
        }
        
    }
