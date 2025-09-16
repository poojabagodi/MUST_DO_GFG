package Tree;
import java.util.*;
public class Mindisbtwnodes {
     class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int lcadist(Node root,int n){
        if(root==null){
            return -1;

        }
        if(root.data==n){
            return 0;
        }
        
        int leftdist=lcadist(root.left, n);
        int rightdist=lcadist(root.right, n);
        if(leftdist==-1 && rightdist==-1){
            return -1;
        }
        else if(leftdist==-1){
            return rightdist+1;
        }
        else{
            return leftdist+1;
        }
    }

}
