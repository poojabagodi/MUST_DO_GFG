package IBM;
import java.util.*;
public class subarrayofsum {

   public static boolean subarray(int arr[],int target){
    int n=arr.length;
    int sum=0;
    int left=0;
    for(int right=0;right<n;right++){
        sum+=arr[right];
        while(sum>target && left <=right){
            sum-=arr[left];
            left++;
        }
        if(sum==target){
            return true;
        }
    }

    return false;
}


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]={1,2,3,7,5};
    int target=12;
    System.out.println(subarray(arr,target));
    sc.close();
}
}
