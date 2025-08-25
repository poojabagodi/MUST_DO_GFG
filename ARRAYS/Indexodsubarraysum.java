package ARRAYS;
import java.util.*;
public class Indexodsubarraysum {

     static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int left=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>target && left<=i){
                sum-=arr[left++];
            }
            if(sum==target){
                ans.add(left+1);
                ans.add(i+1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,7,5};
        int target=12;
        System.out.println(subarraySum(arr,target));
    }
}