package ARRAYS;

public class Zigzagarray {
      public static void zigZag(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            else{
                if(arr[i]<arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    
                }
            }
        }
        
        
        }
}
