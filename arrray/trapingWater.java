import java.util.*;
public class trapingWater{
    public static int trapingWater(int arr[]){
        int trapWater=0;
    //left max array
        int leftmax[]=new int [arr.length];
        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftmax[i]=Math.max(arr[i], leftmax[i-1]);
        }
    //right max array
       int rightmax[]=new int [arr.length];
       rightmax[arr.length-1]=arr[arr.length-1];
       for(int i=arr.length-2;i>=0;i--){
        rightmax[i]=Math.max(arr[i], rightmax[i+1]);
       }
    //loop
        for(int i=0;i<arr.length;i++){
            int WL=Math.min(rightmax[i], leftmax[i]);
            trapWater += WL-arr[i];
        } 
        
       return trapwater;
    }
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
      System.out.println( trapingWater(arr)); 
    }

} 
