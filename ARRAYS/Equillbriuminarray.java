package ARRAYS;

public class Equillbriuminarray {
     // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int rgsum[]=new  int[arr.length];
        int leftsum[]=new int[arr.length];
        rgsum[arr.length-1]=0;
        for(int i=arr.length-2;i>=0;i--){
            rgsum[i]=rgsum[i+1]+arr[i+1];
        }
        
        leftsum[0]=0;
        for(int i=1;i<arr.length;i++){
            leftsum[i]=leftsum[i-1]+arr[i-1];
        }
        
        for(int i=0;i<arr.length;i++){
            if(rgsum[i]==leftsum[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,6};
        System.out.println(findEquilibrium(arr));
    }
}
