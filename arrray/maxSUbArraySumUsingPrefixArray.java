import java.util.*;
public class maxSUbArraySumUsingPrefixArray {
   
    public static void maxSUbArraySumUsingPrefixArray(int arr[]){
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int curr=0,maxSubArraySum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=0;j<arr.length;j++){
                int end=j;
                curr=0;
                curr= start==0 ? prefix[end] : prefix[end]-prefix[start-1];
              /*  if(curr>maxSubArraySum){
                    maxSubArraySum=curr;
                } */
                maxSubArraySum=Math.max(curr, maxSubArraySum);
            }
        }
        System.out.println(" max SubArray sum  using prefix array : " +maxSubArraySum);
    }  
    
    // kadanae Algorithm to calculate max subArray Sum
    public static void maxSUbArraySumUsing_KadaneAlgorithm(int arr[]){
        int cs=0,ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println(" maxSubArray sum using kadane algorithm :" + ms);

    }
    public static void maxSUbArraySumUsing_KadaneAlgorithm_taking_negetive(int arr[]){
        int cs=0,ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            cs=cs+arr[i];
            ms=Math.max(ms,cs);
        }
        System.out.println(" maxSubArray sum using kadane algorithm taking_negetive :" + ms);

    }
    public static void main(String args[]){
        int arr[]={-6,-2,-3,-4};
        // maxSUbArraySumUsingPrefixArray(arr);
        //maxSUbArraySumUsing_KadaneAlgorithm(arr);
        maxSUbArraySumUsing_KadaneAlgorithm_taking_negetive(arr);

    }
}
