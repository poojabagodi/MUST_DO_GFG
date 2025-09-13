package Stack;

public class stackusingLL {
    static class stack{
        class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }

        Node head;
        
        public void push(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }

        public int pop(){
            if(head==null){
                return -1;
            }
            int data=head.data;
            head=head.next;
            return data;
        }


        public int peek(){
            if(head==null){
                return -1;
            }
            return head.data;
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
