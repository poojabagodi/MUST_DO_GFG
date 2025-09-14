package Queue;
import java.util.*;
public class Queueusingtwostacks {
    class stack{
         Queue<Integer> q1 = new LinkedList<>();
         Queue<Integer> q2 = new LinkedList<>();


         public void psuh(int data){
            if(!q1.isEmpty()){
                q1.add(data);
                while(!q2.isEmpty()){
                    q1.add(q2.remove());
                }
            }
            else{
                q2.add(data);
                while(!q1.isEmpty()){
                    q2.add(q1.remove());
                }
            }
         }
            public int pop(){
                if(!q1.isEmpty()){
                    return q1.remove();
                }
                else if(!q2.isEmpty()){
                    return q2.remove();
                }
                else{
                    System.out.println("Queue is empty");
                    return -1;
                }
            }

            public int peek(){
                if(!q1.isEmpty()){
                    return q1.peek();
                }
                else if(!q2.isEmpty()){
                    return q2.peek();
                }
                else{
                    System.out.println("Queue is empty");
                    return -1;
                }
            }
    }
}
