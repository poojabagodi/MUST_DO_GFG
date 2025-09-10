package IBM;

public class Maxsubarrysum {
    public static int maxsum(int arr[]){
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<arr.length;i++){
           curr=Math.max(arr[i], curr+arr[i]);
           max=Math.max(curr, max);         
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxsum(arr));
    }
}