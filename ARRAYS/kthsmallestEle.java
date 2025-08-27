package ARRAYS;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthsmallestEle {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
         for(int ele:arr){
             maxHeap.add(ele);
             if(maxHeap.size()>k){
                 maxHeap.poll();
             }
         }
         return maxHeap.peek();
    }   

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(kthSmallest(arr, k));
    }
}
