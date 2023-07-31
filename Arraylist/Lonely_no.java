import java.util.*;
public class Lonely_no {
    public static void check_Lonely_no(ArrayList<Integer> list){
        
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size(); j++){
                if(list.get(j) == (list.get(i)+1) && list.get(j) == (list.get(i)+1) ){
                    System.out.println();
                }
            }
        }
    }
    public static void main(String args[]){
        
    }
}
