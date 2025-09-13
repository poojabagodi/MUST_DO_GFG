package Stack;
import java.util.*;
public class StackusingAL {
     static class stack{
        ArrayList<Integer> list=new ArrayList<>();
        
        public void push(int data){
            list.add(data);
            return;
        }
        public int pop(){
            if(list.size()==0){
                System.out.println("Stack is empty");
                return -1;

            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public int peek(){
            if(list.size()==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(s.peek()!=-1){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
