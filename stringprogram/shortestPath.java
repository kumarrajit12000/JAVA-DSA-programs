import java .util.*;
public class shortestPath {
    public static void shortestPath(String str){
        int x=0,y=0;   
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) ==  'W'){
                x--;
            }
            if(str.charAt(i) ==  'E'){
                x++;
            }
            if(str.charAt(i) ==  'N'){
                y++;
            }
            if(str.charAt(i) ==  'S'){
                y--;
            }

        }
        System.out.println("shortest path is " + Math.sqrt((x*x)+(y*y)) );       
    }
    public static void main(String args[]){
        String str="WNEENESENNN"; 
        shortestPath(str);
    } 
}
