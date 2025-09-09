package Sorting;

public class Mergesort {

    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei) return;
        int mid=(si+ei)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        
        while(i<=mid){
             temp[k++]=arr[i++];
                
        }
        while(j<=ei){
             temp[k++]=arr[j++];
                
        }
        for(i=si,k=0;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        int arr[] = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        mergesort(arr, 0, arr.length - 1);

        System.out.println("\n\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}