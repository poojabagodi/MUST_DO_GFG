package Stack;
import java.util.*;
public class Reversestack {

    public static void pushatbottom(Stack<Integer> stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top=stack.pop();
        pushatbottom(stack, data);
        stack.push(top);
    }
    public static void rev(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top=stack.pop();
        rev(stack);
        pushatbottom(stack, top);
  
    }
}
