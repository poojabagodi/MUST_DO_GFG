package ARRAYS;

public class Trappingrainwater {
     public static  int maxWater(int arr[]) {
        // code here
        int n=arr.length;
        int water=0;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            water+=waterlevel-arr[i];
        }
        return water;
    }
   public static void main(String[] args) {
       int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
       System.out.println(maxWater(arr));
   }
}
