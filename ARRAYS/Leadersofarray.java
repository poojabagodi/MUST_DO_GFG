package ARRAYS;

import java.util.ArrayList;
import java.util.Collections;

public class Leadersofarray {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int max=arr[arr.length-1];
        ans.add(max);
        for(int i=arr.length-2;i>=0;i--){
           if(arr[i]>=max){
               ans.add(arr[i]);
               max=arr[i];
           }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        System.out.println(leaders(arr));
    }
}
