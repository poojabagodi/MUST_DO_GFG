package ARRAYS;

import java.util.Arrays;

public class Numofplatforms {
     public int findPlatform(int arr[], int dep[]) {
        //  code here
        int n=arr.length;
       Arrays.sort(arr);
       Arrays.sort(dep);
       int res=1,plat=1;
       int i=1,j=0;
       while(i<n && j<n){
           if(arr[i]<=dep[j]){
               plat++;
               i++;
           }
           else{
               plat--;
               j++;
           }
        res=Math.max(plat,res);
       }
       

       return res;
    }

    public static void main(String[] args) {
        int arr[]={10, 15, 20, 25, 30};
        int dep[]={12, 17, 22, 26, 35};
        Numofplatforms obj=new Numofplatforms();
        System.out.println(obj.findPlatform(arr, dep));
    }
}
