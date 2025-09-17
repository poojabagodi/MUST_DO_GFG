package Tree;
import java.util.*;
public class Transform {
    class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static int transform(Node root){
          if(root==null){
            return 0;
          }
          int leftchild=transform(root.left);
          int rightchild=transform(root.right);
          int data=root.data;
          int newleft=root.left==null?0:root.left.data;
          int newright=root.right==null?0:root.right.data;
           root.data=leftchild+newleft+rightchild+newright;
           return data;

    }
}
