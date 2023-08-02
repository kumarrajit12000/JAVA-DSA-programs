import java.util.*;
public class fnOverloading {
public static int sum(int a,int b){
return a+b;
} 
public static float  sum(float a,float b){
return a+b;
}
  
public static void main(String args[]){
    
System.out.println(sum(5,5));
System.out.println(sum(5.5f,5.5f));

}
}