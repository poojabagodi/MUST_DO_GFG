package IBM;

public class Buysellstocks {
    public static int maxpro(int arr[]){
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            minprice=Math.min(minprice, arr[i]);
            maxprofit=Math.max(maxprofit, arr[i]-minprice);
        }
        return maxprofit;
    }


    public static int max(int arr[]){
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit+=arr[i]-arr[i-1];
            }
        }   
        return profit;
    }
}
