import java.util.*;

import javax.swing.text.AbstractDocument.LeafElement;
public class buysellstocks {
    public static int maxPrfit(int nos[]){
        int buy=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<nos.length;i++){
            int sell=nos[i];
            if(buy<sell){
            int profit=sell-buy;
                maxProfit=Math.max(profit, maxProfit);
            }
            else{
                buy=sell;
            }
        }
              return maxProfit;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int size=sc.nextInt();
        int nos[]=new int[size];

        System.out.println("enter values:");
        for(int i=0;i<size;i++){
            nos[i]=sc.nextInt();
        }
        /*
        int maxprofit=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                int profit=nos[j]-nos[i];
                if(profit>maxprofit){
                    maxprofit=profit;
                }
             
            }
           
        }    */

        System.out.println( maxPrfit(nos) );

        

    }
}