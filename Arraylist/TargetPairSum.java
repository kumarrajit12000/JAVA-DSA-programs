import java.util.*;
public class TargetPairSum {
    public static boolean twoPointerApproach(ArrayList <Integer> List,int target){
        int lp=0;
        int rp=List.size()-1;
        while(lp<rp){
            if(target == List.get(lp)+List.get(rp)){
                return true;
            }
            else if((target > List.get(lp)+List.get(rp))){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }

    public static boolean  TargetPairSum(ArrayList <Integer> List,int target){
        for(int i=0; i<List.size(); i++){
            for(int j=i+1; j<List.size(); j++){
                if(target == List.get(i)+List.get(j)){
                    return true;
                }
            }
        }
        return false;
    }   
    public static void main(String args[]){
        ArrayList<Integer> List =new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        int target =5;
        
       System.out.println( TargetPairSum(List, target));
       System.out.println(twoPointerApproach(List, target)  );
     } 
}
