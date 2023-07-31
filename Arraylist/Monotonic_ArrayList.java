import java.util.*;
public class Monotonic_ArrayList {
    public static boolean check_Monotonic(ArrayList<Integer> list){
        int k=0;
        if(list.get(k) < list.get(k+1)){
            for(int i=1; i<list.size()-1; i++){
                if(list.get(i)<=list.get(i+1)){
                    return true;
                }
            }    
        }
        else{
            for(int i=0; i<list.size()-1; i++){
                if(list.get(i)>=list.get(i+1)){
                    return true;
                }
            }
        }
       
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
        System.out.println(check_Monotonic(list));

    }  
}    