package Capgemini;

import java.util.Arrays;

public class Platformsneede {
    public static int findplatform(int arr[],int dep[]){
        int n=arr.length;
        int m=dep.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platform=1;
        int result=1;
        int i=1;
        int j=0;
        while(i<n && j<m){
            if(arr[i]<=dep[j]){
                platform++;
                i++;
                if(platform>result){
                    result=platform;
                }
            }
            else{
                platform--;
                j++;
            }
        }
        return result;
    }
}
