import java.util.*;

import javax.lang.model.util.SimpleAnnotationValueVisitor8;
 class RemoveStringDuplicate {
    public static void removeDuplicate (String str,int idx,StringBuilder newString,String arr[] ){
        if(idx == str.length()){
            System.out.println(newString);
        }        
        if(arr [str.charAt(idx) - 'a'] == "true"){
        removeDuplicate(str, idx+1, newString, arr);
        }
        else{
            arr[str.charAt(idx) - 'a'] = "true";
        
            removeDuplicate(str, idx+1, newString.append(str.charAt(idx)), arr);
        }
    } 
    public static void main(String args[]){
       
        removeDuplicate("appnnaccollege", 0, new StringBuilder(""), new String [26]);
    }   
}