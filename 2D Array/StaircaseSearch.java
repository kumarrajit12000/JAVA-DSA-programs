import java.util.*;
public class StaircaseSearch {
    public static boolean StaircaseSearch(int arr[][],int key){
        int i=arr.length-1,j=0;
        while(j<arr[0].length && i>=0){
            if(key < arr[i][j]){
                i--;
            }
            else if(key > arr[i][j]){
                j++;
            }
            else if(key == arr[i][j]){
                System.out.println("found at index " + "("+i+ ","+j+")");
                return true;
            }
        }
        return false;
    } 
    public static void main(String args[]){
        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=32;
        System.out.println(StaircaseSearch(arr, key));  
    }   
}
