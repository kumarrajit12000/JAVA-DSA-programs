import java.util.*;
public class countStringVowles {
    public static  void main(String args[]){
        String str="Rajitkumarpanchal";
        char vowels[]={'a','e','i','o','u'};
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<vowels.length;j++){
                if(str.charAt(i) == vowels[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
