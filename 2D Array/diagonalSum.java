import java.util.*;
public class diagonalSum {
    public static void DialdonalSuum(int mat[][]){
        int sum=0;
        for(int i=0;i<mat.length;i++){
    //primary Diagonal sum
            sum+=mat[i][i];
    //secondary diagonal sum
        if(i != mat.length-1-i){
            sum+=mat[i][mat.length-1-i];
        }
        
        }
        System.out.println( "DiagonalSum is : "+ sum);
        
    }
    public static void main(String args[]){
        int mat[][]={{1,2,3},{4,5,6,},{7,8,9,}};
         DialdonalSuum(mat);
       
       
    } 
    } 

