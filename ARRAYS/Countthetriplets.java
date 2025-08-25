package ARRAYS;

import java.util.Arrays;

public class Countthetriplets {
     static int countTriplet(int arr[]) {
        // code here
        Arrays.sort(arr);
        int count=0;
        int n=arr.length;
        for(int k=n-1;k>=2;k--){
            int i=0;
            int j=k-1;
            while(i<j){
                int sum=arr[i]+arr[j];
                if(sum==arr[k]){
                    count++;
                    i++;
                    j--;
                    
                }
                else if(sum<arr[k]){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
       
        int[] arr = {1, 5, 3, 2};
        System.out.println(countTriplet(arr));
    }
}
