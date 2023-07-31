import java.util.*;
public class ArrayList_Oprations {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //add op   TC - O(1)
        list.add(1);  
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        //remove op   TC - O(1)
        list.remove(1);
        list.remove(3);
        System.out.println(list);
        // set op    tc-O(n)
        list.set(2,5);
        list.set(1,2);
        System.out.println(list);
        // get op    tc-O(1)
        System.out.println( list.get(2));
        System.out.println( list.get(1));
        //contain op  tc - O(n)
       System.out.println( list.contains(5));
        System.out.println( list.contains(10));
        //size op
       System.out.println( list.size());

       //print ArrayList 
       for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i));

       }
       System.out.println("");
       //print reverse list
       for(int i=list.size()-1; i>=0; i--){
        System.out.print(list.get(i));
       }
      


    }
}