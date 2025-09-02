package Capgemini;

public class subarraysum {
    
    public static int findsub(int arr[],int target){
        int sum=0;
         int start=0;
         int n=arr.length;
         for(int end=0;end<n;end++){
            sum+=arr[end];
            while(sum>target && start<=end){
                sum-=arr[start];
                start++;
                
            }
            if(sum==target){
                    return 1;
                }
         }
         return 0;
    }
}
