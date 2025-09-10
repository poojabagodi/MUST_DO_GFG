package LinkedList;

public class LLpalindrome {
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

         public void print(){
          Node temp=head;
          while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
          }
          System.out.println("null");
         }
         public Node findmid(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
         }

            public Node reverse(Node head){
                Node prev=null;
                Node curr=head;
                Node next;
                while(curr!=null){
                    next=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=next;
                }
                return prev;
            }

            public boolean isPalindrome(){
                if(head==null || head.next==null){
                    return true;
                }
                //step1-find mid
                Node mid=findmid(head);
                //step2-reverse 2nd half
                Node revhead=reverse(mid);
                //step3-compare both halves
                Node curr1=head;
                Node curr2=revhead;
                while(curr2!=null){
                    if(curr1.data!=curr2.data){
                        return false;
                    }
                    curr1=curr1.next;
                    curr2=curr2.next;
                }
                return true;
            }



            public boolean iscycle(){
                Node slow=head;
                Node fast=head;
                while(fast!=null && fast.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                    if(slow==fast){
                        return true;
                    }
                }
                return false;
            }


            public void removecycle(){
                Node slow=head;
                Node fast=head;
                boolean cycle=false;
                while(fast!=null && fast.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                    if(slow==fast){
                        cycle=true;
                        break;
                    }
                }
                if(cycle==false){
                    return;
                }
                slow=head;
                Node prev=null;
                while(slow!=fast){
                    prev=fast;
                    slow=slow.next;
                    fast=fast.next;
                }
                prev.next=null;
            }
}
