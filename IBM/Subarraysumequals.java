package IBM;
import java.util.*;
public class Subarraysumequals {
    public static int count(int arr[],int k){
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int s:arr){
            sum+=s;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
