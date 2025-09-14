package Queue;

public class Queueusinfcirculararray {
    class queue{
        int arr[];
        int size;
        int front,rear;
        queue(int n){
            arr=new int[n];
            front=-1;
            rear=-1;
            size=n;
        }
        boolean isempty(){
            return front==-1&&rear==-1;
        }
        boolean isfull(){
             return (rear+1)%size==front;
        }

        public void add(int data){
            if(isfull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }


        public int remove(){
            if(isempty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result=arr[front];
            if(front==rear){
                front=rear=-1;
            }
            front=(front+1)%size;
            return result;

        }


        public int peek(){
            if(isempty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
}
