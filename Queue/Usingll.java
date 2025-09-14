package Queue;

public class Usingll {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    class queue{
        Node front,rear;
        int size;
        queue(){
            front=rear=null;
            size=0;
        }


        boolean isEmpty(){
            return size==0;
        }

        public void add(int data){
            Node newnode=new Node(data);
            if(rear==null){
                front=rear=newnode;
            }else{
                rear.next=newnode;
                rear=newnode;   
            }
            size++;
        }



        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int res=front.data;
            front=front.next;
            if(front==null){
                rear=null;
            }
            size--;
            return res;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }
    }

    public static void main(String[] args) {
        Usingll u=new Usingll();
        queue q=u.new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
