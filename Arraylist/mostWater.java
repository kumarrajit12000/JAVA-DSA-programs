import java.util.*;
 public class mostWater {
    public static void maxWater(ArrayList<Integer> height){             //tc-O(n)
        int max=Integer.MIN_VALUE;
            int lp=0;
            int rp=height.size()-1;
        while(lp<rp){
            int waterLevel = Math.min(height.get(lp), height.get(rp));
            int width =rp-lp;
            max = Math.max(max, waterLevel * width);
        if(height.get(lp)>height.get(rp)){
            rp--;
        }
        else{
            lp++;
        }
        } 
        
        System.out.println(max);
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int maxWAterContainer =Integer.MIN_VALUE;       //tc = O(n*n)
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int waterLevel = Math.min(height.get(i), height.get(j));
                int width =j-i;
                maxWAterContainer = Math.max(maxWAterContainer, waterLevel * width);
            }
        }
        System.out.println(maxWAterContainer);
        maxWater(height);
    }    
}
