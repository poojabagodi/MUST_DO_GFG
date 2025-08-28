package ARRAYS;

public class Elementwithleftsidesmallerandrightsidegreater {
  public int findElement(int[] arr) {
          int n = arr.length;
        if (n < 3) return -1;

        int[] leftmax = new int[n];
        int[] rightMin = new int[n];
        
        
        leftmax[0]=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],arr[i-1]);
        }
        
        rightMin[n - 1] = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], arr[i + 1]);
        }
        
        
         for (int i = 1; i < n-1; i++) {
            if (leftmax[i] < arr[i] && arr[i] < rightMin[i]) {
                return arr[i];
            }
        }

        return -1;
        
    }   
}
