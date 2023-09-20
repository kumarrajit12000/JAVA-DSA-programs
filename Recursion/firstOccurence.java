import java.rmi.StubNotFoundException;
import java.util.*;
public class firstOccurence {
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        int i=0;
        int key = 8;
        fo(arr, i, key);
    }   
    public static void fo(int arr[],int i,int key){
        if(i == arr.length-1){
            System.out.println("Key not found");
        }
        if(arr[i] == key){
            System.out.println(i);
            return;
        }
        fo(arr, i+1, key);
    } 
}
