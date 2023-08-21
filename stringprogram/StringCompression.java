import java.util.*;
public class StringCompression {
    public static void main(String args[]){
        String str="aaabbccccddhggdgfjhjjjjjjjjjjjjeryjdfhjyee";
        
        StringBuilder sc=new StringBuilder();
    for(int i=0;i<str.length();i++){
        Integer count=1;
        while(  i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
        }
        sc.append(str.charAt(i));
        if(count != 1){
            sc.append(count.toString());
        }
        
        

    }
    System.out.println(sc);

    }    
}
