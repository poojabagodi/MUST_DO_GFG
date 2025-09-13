package Stack;
import java.util.*;
public class isduplicate {

    public static boolean isduplicate(String str){
        Stack<Character> s=new Stack<>();
          for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr==')'){
                int count=0;
             while(s.peek()!='('){
                s.pop();
                count++;
             }
             if(count<1){
                return true;
             }
             else{
                s.pop();
             }
            }
            else{
                s.push(curr);
            }
          }
            return false;
    }
    
}
