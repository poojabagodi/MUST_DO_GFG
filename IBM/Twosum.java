package IBM;
import java.util.*;
public class Twosum {
    public static int[] twosum(int arr[],int target){
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        int comp=target-arr[i];
        if(map.containsKey(comp)){
          return new int[]{map.get(comp),i};
        }
        map.put(arr[i],i);
       }
       return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        int ans[]=twosum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
