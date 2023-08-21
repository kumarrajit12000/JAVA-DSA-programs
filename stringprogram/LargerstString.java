import java.util.*;
public class LargerstString{
    public static void main (String args[] ){
        String str[]={"rajit","kapil","hemant","arun","vikash"};
        String largest=str[0];
        String smallest=str[0]; 
        for(int i=1;i<str.length;i++){
           if(largest.compareTo(str[i]) < 0 ) {
            largest =str[i];
            }
            if(largest.compareTo(str[i]) > 0){
                smallest=str[i];
            }
           
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
