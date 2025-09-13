package Stack;
import java.util.*; 
public class Maxareaofhistogram {
    public static int maxarea(int arr[]){
        int maxarea=0;
        int[] nsr=new int[arr.length];
        int[] nsl=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        //nsr
        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            while(!s.isEmpty() && arr[s.peek()]>=curr){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
        }
        //nsl
        s.clear();
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            while(!s.isEmpty() && arr[s.peek()]>=curr){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
        }
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            maxarea=Math.max(maxarea,height*width);
        }
        return maxarea;
    }
}
