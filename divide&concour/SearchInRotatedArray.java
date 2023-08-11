import java.util.*;
public class SearchInRotatedArray {
    public static int SearchInRotatedArray(int arr[],int key,int si,int ei){
       if(si > ei){
        return -1;
       }
        int mid=(si+ei)/2;
        if(arr[mid] == key){
            return mid;
        }
        if(arr[si] <= key && arr[mid] >= key){    //left line
            return SearchInRotatedArray(arr, key, si, mid-1);
        }

        else{                          //right line
            return SearchInRotatedArray(arr, key, mid+1, ei);
        }
        


    }
    public static void main(String args[]){
        int arr[]={6,7,8,9,1,2,3,4};
        System.out.println(SearchInRotatedArray(arr, 4, 0, arr.length-1)); 
    }
}
