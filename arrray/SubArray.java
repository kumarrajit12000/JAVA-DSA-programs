import java.util.*;
public class SubArray {
    public static void SubArray(int arr[]){
        int sum=0; int maxSubArraySum=Integer.MIN_VALUE;
        //outerloop
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=0;j<arr.length;j++){
                int end=j;
                 sum=0;
                //print 
                for(int k=start;k<=end;k++){
                    
                    sum=sum+arr[k];
                  
                     }
                    
                System.out.print(sum+" ");
                if(sum>maxSubArraySum){
                    maxSubArraySum=sum;
                }
                
              
            }
            
            System.out.println("");
        }
        System.out.println("maxSubArraySum : "+maxSubArraySum);
        
    }
    public static void tSubArray(int n){
        
        int t=n*(n+1)/2;
        System.out.println("total subarray : "+t);     
    }
    
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        SubArray(arr);
        int n=arr.length;
        tSubArray(n);
    }
}
