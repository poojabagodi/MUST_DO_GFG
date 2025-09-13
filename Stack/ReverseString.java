package Stack;
import java.util.*;
public class ReverseString {
    public static String rev(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        StringBuilder sb=new StringBuilder("");
        while(!stack.isEmpty()){    
            sb.append(stack.pop());
        }
        return sb.toString();
    }


}
