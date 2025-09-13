package Stack;
import java.util.*;
public class Nextgreater {
    
    public static void Nextgreater(int arr[]){
        int nge[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        nge[arr.length-1]=-1;
        s.push(arr.length-1);
        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            while(!s.isEmpty() && curr>=arr[s.peek()]){
                s.pop();
            
            }
            if(s.isEmpty()){
                nge[i]=-1;
            }
            else{
                nge[i]=arr[s.peek()];
            }
        }
    }
}
