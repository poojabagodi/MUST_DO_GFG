package IBM;
import java.util.*;
public class Minimumnumofswaps {
    public static int minswaps(int arr[]){
        int n=arr.length;
        int pairs[][]=new int[n][2];
        for(int i=0;i<n;i++){
            pairs[i][0]=arr[i];
            pairs[i][1]=i;
        }

        Arrays.sort(pairs,(a,b) ->a[0]-b[0]);
        boolean visited[]=new boolean[n];
        int cycle=0;
        for(int i=0;i<n;i++){
            if(visited[i] || pairs[i][1]==i){
                continue;
            }
            else{
                int j=i;
                int cycle_size=0;
                while(!visited[j]){
                    visited[j]=true;
                    j=pairs[j][1];
                    cycle_size++;
                }
                if(cycle_size>0){
                    cycle+=cycle_size-1;
                }
            }
        }

        return cycle;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={101,758,315,730,472,619,460,479};
        System.out.println(minswaps(arr));
        sc.close();
    }
}
