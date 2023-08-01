import java.util.*;
public class matrixtranspose {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array n*m");
    int n=sc.nextInt();
    int m=sc.nextInt();

    int mat[][]=new int[n][m];
    System.out.println("enter values:");
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
         mat[i][j]=sc.nextInt();
        }        
    }
    System.out.println("transpose of matrix is");
    for(int j=0;j<m;j++){
        for(int i=0;i<n;i++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println(" ");

    }
}}
