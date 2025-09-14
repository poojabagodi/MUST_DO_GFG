package GreedyAlgo;
import java.util.*;
public class Activityselection {
    public static void main(String[] args){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
       ArrayList<Integer> ans=new ArrayList<>();
       int maxact=0;

       maxact=1;
       ans.add(0);
       int lastend=end[0];
       for(int i=1;i<end.length;i++){
        if(start[i]>=lastend){
            maxact++;
            ans.add(i);
            lastend=end[i];
        }
       }

         System.out.println("Maximum activities: "+maxact);

    }
}
