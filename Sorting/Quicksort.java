package Sorting;

public class Quicksort {
     public static void quicksort(int arr[],int si,int ei){
       if(si>=ei) return;
       int pindx=partition( arr, si,ei);
       quicksort(arr,si,pindx-1);
       quicksort(arr,pindx+1,ei);
   }
   
   public static int partition(int arr[],int si,int ei){
       int pivot=arr[ei];
       int i=si-1;
       for(int j=si;j<ei;j++){
           if(arr[j]<=pivot){
               i++;
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }
       }
           i++;
           int temp=pivot;
           arr[ei]=arr[i];
           arr[i]=temp;
           return i;
       
   }
   
   
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        int arr[] = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        quicksort(arr, 0, arr.length - 1);

        System.out.println("\n\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
