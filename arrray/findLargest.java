import java.util.*;
public class findLargest {
    public static void findlargest(int arr[],int max){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        
        }
        System.out.println("max is " + max);
        

    }
    public static void main(String args[]){
        int arr[]={3,4,5,2,9,24};
        int max=Integer.MIN_VALUE;
        findlargest(arr, max);
    }    
}
