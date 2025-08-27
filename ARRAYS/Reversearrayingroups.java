package ARRAYS;

public class Reversearrayingroups {
      public void reverseInGroups(int[] arr, int k) {
        // code here
        
        for(int i=0;i<arr.length;i+=k){
            int l=i;
            
            int r=Math.min(i+k-1,arr.length-1);
            
            while(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            
                l++;
            
                r--;
            }
            
        }
        
    }

    public static void main(String[] args) {
        Reversearrayingroups obj=new Reversearrayingroups();
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=3;
        obj.reverseInGroups(arr, k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
