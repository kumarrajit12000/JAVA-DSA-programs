import java.util.*;
public class MergeSort {
    public static void mergesort(int arr[] ,int si , int ei){
        //base case 
        if(si >= ei){
            return;
        }
        //kaam
        int mid = (si +ei) /2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
      
    }
    public static void merge(int arr[] ,int si,int mid ,int ei){
        
        int temp[]=new int[si+ei+1];
        int k=0;
        int j=mid+1;
    //sort left and right

        while(si<=mid && j <= ei){

            if( arr[si] < arr[j] ){
                temp[k]=arr[si];
                 si++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
    // sort left elements from left and right
        while(si <= mid){
            temp[k++] = arr[si++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }
    
    // copy temp to arr
     for( k=0, si=0; k<temp.length; k++,si++){
        arr[si] = temp[k];
     }


    }
    public static void main(String args[]){
        int arr[]={2,7,4,9,3,1};
        
        mergesort(arr, 0, arr.length-1);

         for(int k=0; k<arr.length; k++){
        System.out.println(arr[k]);
        }
        
    }
}