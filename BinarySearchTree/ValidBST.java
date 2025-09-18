package BinarySearchTree;
import java.util.*;
public class ValidBST {
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }

    }

    public static Node insert(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(root.data>data){
            root.left=insert(root.left, data);
        }
        else{
            root.right=insert(root.right, data);
        }
        return root;
    }

    public static boolean isvalid(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<min.data){
            return false;
        }
        else if(max!=null && root.data>max.data){
            return false;
        }
        return isvalid(root.left, min, root) && isvalid(root.right, root, max);
    }
    public static void main(String[] args) {
        int values[]={4,5,6,8,2,5,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
           root=insert(root, values[i]);
        }
    
       System.out.println(isvalid(root, null, null));
    

    }

}
