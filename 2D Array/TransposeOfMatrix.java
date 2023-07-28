import java.util.*;
public class TransposeOfMatrix {
    public static void TransposeOfMatrix(int mat[][])  {
        int row=mat.length;
        int col=mat[0].length;
        int transpose[][]=new int[col][row];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                transpose[j][i]=mat[i][j];
            }
        }
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
            System.out.print(transpose[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        int mat[][]={{1,2,3},{4,5,6}};
        TransposeOfMatrix(mat);
       
    }  
}
