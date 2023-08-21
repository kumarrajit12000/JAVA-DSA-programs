import java.util.*;
public class letterToUppercase {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder();
        String str ="hi i am rajit kumar";

        sb.append( Character.toUpperCase(str.charAt(0))  );
        
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' '){
                sb.append(str.charAt(i));
                i++;
               sb.append(  Character.toUpperCase(str.charAt(i))  );

            }
            else{
                sb.append(str.charAt(i));
            }
            

        }
        System.out.println(sb);
    }    
}
