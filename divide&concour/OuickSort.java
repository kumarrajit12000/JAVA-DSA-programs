import java.util.*;
public class OuickSort {
    public static void OuickSort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        // return pivoit index
        int pindex = partition( arr, si, ei);

        OuickSort(arr, si, pindex-1);
        OuickSort(arr, pindex + 1, ei);

    }
    public static int partition(int arr[],int si,int ei){
        int pivoit = arr[ei];
        int i = si-1 ;
        
        for(int j=si;j<ei;j++){
            if(arr[j] <= pivoit){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] =temp;
            }
        }
        i++;
        int temp = pivoit;
        arr[ei] = arr[i];
        arr[i] =temp;
        return i;

    }
 public static void main(String args[]) {
    int arr[]={2,-1,-5,8,4,-10};
    
        OuickSort(arr,0,arr.length-1);
        for(int k=0; k<arr.length; k++){
            System.out.println(arr[k]);
            }
    }
}
