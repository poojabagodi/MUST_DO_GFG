package ARRAYS;

import java.util.*;



public class RearrangeArrayAlternate {
   public static void rearrange(int arr[]){
           int n=arr.length;
           int maxele=arr[n-1]+1;
           int minidx=0;
           int maxidx=n-1;
           for(int i=0;i<n;i++){
               if(i%2==0){
                   arr[i]+=(arr[maxidx]%maxele)*maxele;
                   maxidx--;
               }
               else{
                   arr[i]+=(arr[minidx]%maxele)*maxele;
                   minidx++;
               }
           }
           for(int i=0;i<n;i++){
               arr[i]=arr[i]/maxele;
           }

   }
   public static void main(String[] args) {
       int arr[] = {1, 2, 3, 4, 5, 6};
       rearrange(arr);
       System.out.println(Arrays.toString(arr));
   }
}
