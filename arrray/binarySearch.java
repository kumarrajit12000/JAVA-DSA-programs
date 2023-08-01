import java.util.*;
public class binarySearch {
    public static int BinarySearch(int arr[],int key){
        int start=0; int end=arr.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    } 
    public static void main(String args[]){
        int arr[]={2,5,7,8,10,15,18};
        int key=15;
       System.out.println("index no is :"+BinarySearch(arr, key)); 
      
    }   
}
