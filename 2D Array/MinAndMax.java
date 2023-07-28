
import java.util.Scanner;
public class MinAndMax{
    
    public static void MinAndMax(int mat[][]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                max=Math.max(max, mat[i][j]);
                min=Math.min(min, mat[i][j]);
            }
        }
        System.out.println("max is : " + max);
        System.out.println("min is : " + min);

}

    public static void countKey(int mat[][],int key){
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == key){
                    count++;
                }
            }
        }
        System.out.println("count key is " + count);
    
        }
    public static void main(String args[]){
        int mat[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j]=sc.nextInt();
            }
        } 

        MinAndMax(mat);
        countKey(mat, 7);
    }
    
}
