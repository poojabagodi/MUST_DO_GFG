package ARRAYS;

import java.util.ArrayList;
import java.util.Collections;

public class Chocolatedistribution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int n=arr.size();
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            mindiff=Math.min(mindiff,arr.get(i+m-1)-arr.get(i));
        }
        
        return mindiff;
    }   
}
