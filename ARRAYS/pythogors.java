package ARRAYS;

import java.util.Arrays;

public class pythogors {
     boolean pythagoreanTriplet(int[] arr) {
        // code here
        
        for(int i=0;i<arr.length;i++){
            arr[i]*=arr[i];
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=2;i--){
            int left=0,right=i-1;
            
            while(left<right){
            if(arr[left]+arr[right]==arr[i]){
                return true;
            }
            else if(arr[left]+arr[right]<arr[i]){
                left++;
            }
            else{
                right--;
            }
            }
        }
        return false;
    }
}
