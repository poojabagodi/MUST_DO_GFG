package IBM;
import java.util.*;
public class Arrayrotation {
    public static void rotate(int arr[],int k){
           int n=arr.length;
           k=k%n;
           reverse(arr,0,n-1);
           reverse(arr,0,k-1);
           reverse(arr,k,n-1);

    }


    public static void reverse(int arr[],int left,int right){

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int arr[]={1,2,3,4,5,6,7};
       int n=arr.length;
       int k=3;
        rotate(arr,k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
