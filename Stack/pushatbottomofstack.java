package Stack;
import java.util.*;

public class pushatbottomofstack {
    public static void pushat(Stack<Integer> stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top=stack.pop();
        pushat(stack, data);
        stack.push(top);
    }
}
