package ARRAYS;

public class maxsumsubarraykadanes {
    static int maxSubarraySum(int[] arr) {
        // Code here
        int maxsum=Integer.MIN_VALUE;
        boolean isneg=true;
        for(int i=0;i<arr.length;i++){
            maxsum=Math.max(maxsum,arr[i]);
            if(arr[i]>=0){
                isneg=false;
                break;
            }
        }
        if(isneg){
            return maxsum;
        }
        maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if(currsum<0){
                currsum=0;
            }
            
            maxsum=Math.max(maxsum,currsum);
        }
        
      return maxsum;  
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarraySum(arr));
    }
}
