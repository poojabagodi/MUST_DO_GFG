package ARRAYS;
import java.util.*;
public class Mergewithoutextraspace {
     public void mergeArrays(int a[], int b[]) {
        // code here
       int n=a.length;
       int m=b.length;
       for(int i=0;i<n;i++){
           if(a[i]>b[0]){
               int temp=a[i];
               a[i]=b[0];
               b[0]=temp;
           }
           
           int top=b[0];
           int k;
           for(k=1;k<m && b[k]<top;k++){
               b[k-1]=b[k];
           }
           b[k-1]=top;
       }
    }

    public static void main(String[] args) {
        Mergewithoutextraspace obj = new Mergewithoutextraspace();
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        obj.mergeArrays(a, b);
        System.out.println("Merged arrays:");
        System.out.println("Array A: " + Arrays.toString(a));
        System.out.println("Array B: " + Arrays.toString(b));   
    }
}
