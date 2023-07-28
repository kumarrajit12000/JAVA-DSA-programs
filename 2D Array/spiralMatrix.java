import java.util.*;
public class spiralMatrix {

    public static void spiralMatrix(int mat[][]){
        int sr=0;
        int sc=0;
        int ec=mat[0].length-1;
        int er=mat.length-1;
        
        while(sr<=er && sc<=ec){
        //top
            for(int j=sc;j<=ec;j++){
                System.out.print(mat[sr][j]);
            }   
        //Rigth
            for(int i=sr+1;i<=er;i++){
                System.out.print(mat[i][ec]);
            }
        //bottom
            for(int j=ec-1;j>=sc;j--){
                if(sr == er){
                    break;
                }
                System.out.print(mat[er][j]);
            }
        //left
            for(int i=er-1;i>=sr+1;i--){
                if(sc == ec){
                    break;
                }
                
                
                System.out.print(mat[i][sc]);
            }
        //update
        sr++;
        sc++;
        er--;
        ec--;

        }

    }  
    public static void main(String args[]){
        int mat[][]={{1,2,3},{4,5,6,},{7,8,9,}};
        spiralMatrix(mat);
    }  
}
