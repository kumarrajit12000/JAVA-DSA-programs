import java.util.*;
public class linearSearch {
public static int linearSearch(int arr[],int n){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==n){
            return i;
        }
        
    }
    return -1;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter arr size");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("enter elements");
    for(int i=0;i<size;i++){
    
         arr[i]=sc.nextInt();

    }
    System.out.println("enter search elemnt");
    int n=sc.nextInt();
    int index=linearSearch(arr, n);
    if(index==-1){
        System.out.println("not found");
    }
    else{
        System.out.println("index is "+ index);
    }


}
    
}
