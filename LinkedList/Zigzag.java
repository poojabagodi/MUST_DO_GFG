package LinkedList;
import java.util.*;

public class Zigzag {
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

   public void zig(Node head){
    if(head==null || head.next==null){
        return;
    }

    //find mid
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }

    Node mid=slow;
    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node left=head;
    Node right=prev;
    Node nextR,nextL;
    while(left!=null && right!=null){
        nextL=left.next;
        left.next=right;
        nextR=right.next;
        right.next=nextL;
        left=nextL;
        right=nextR;
    }

   }

   
}
