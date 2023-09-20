import java.util.*;
public class AllOccurence {
    public static void Ao( int arr[],int i,int key){
        if(i == arr.length){
            return;
        }
        if(key == arr[i]){
            System.out.println(i);
        }
        Ao(arr, i+1 , key);
    }    
    public static void main(String args[])
{
    int arr[] ={3,2,4,5,6,2,7,2,2};
    Ao(arr, 0, 2);
}}
