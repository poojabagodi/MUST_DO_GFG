package LinkedList;

public class Implementation {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

   static Node head;
   static Node tail;
   static int size;

   public void addFirst(int data){
    Node newnode=new Node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
    newnode.next=head;
    head=newnode;
   }

   public void addLast(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;
   }


   public void addMiddle(int data,int idx){
        Node newNode=new Node(data);
        size++;
        if(idx==0){
            addFirst(data);
            return;
        }
        if(idx==size-1){
            addLast(data);
            return;
        }
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;

   }


    public int removeFirst(){
         if(size==0){
            System.out.println("LL is empty");
            return -1;
         }
            else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            int val=head.data;
            head=head.next;
            size--;
            return val;
    }

    public int removeLast(){
       if(size==0){
        System.out.println("LL is empty");
        return -1;
       }
       else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
       }

       Node prev=head;
       for(int i=0;i<size-2;i++){
        prev=prev.next;
       }
       int val=tail.data;
       tail=prev;
       tail.next=null;
       size--;
       return val;
    }
   public boolean Search(int key){
    Node temp=head;
    while(temp!=null){
        if(temp.data==key){
            return true;
        }
        temp=temp.next;
    }
    return false;
   }

   public int recsearch(int key){
    return recsearchHelper(head, key);
   }

   public int recsearchHelper(Node head,int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int index=recsearchHelper(head.next, key);
    if(index==-1){
        return -1;
    }
    return index+1;
   }


   public void reverse(){
    Node prev=null;
    Node curr=head=tail;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
   }

   public void printll(){
    if(head==null){
        System.out.println("Linked List is empty");
        return;

    }

    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
   }


    public static void main(String[] args) {
     Implementation ll=new Implementation();
     ll.addFirst(2);
     ll.addFirst(1);
     ll.addLast(4);
     ll.addLast(5);
     ll.addMiddle(3, 2);
     ll.printll();
    }
}
