import java.net.SocketTimeoutException;

//.equals() - compare the values reference by string
// ==  - compare object of string 

public class equlesFn {
    public static void main(String args[]){
        String str="Rajit";
        String str1="rajit kumar panchal";
        String str2=new String("rajit");
        if(str == str1){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        if(str.equals(str1)){  
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

        System.out.println("second compare");

        if(str == str2){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        if(str.equals(str2)){
            System.out.println("equals");
        }
        else{
            System.out.println("not equal");
        }

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        for(int i=0;i<str1.length();i++){
        if(str1.charAt(0) == str1.charAt(0)){
            str1.toUpperCase();
        }
        else{
            str1.toLowerCase();
        }
        }
        System.out.println(str);
    }
    
}
