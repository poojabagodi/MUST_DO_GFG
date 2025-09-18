package BinarySearchTree;
import java.util.*;
public class MirrorBST {



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

    public static Node createMirror(Node root){
        if(root==null){
            return null;
        }
        Node leftMirror=createMirror(root.left);
        Node rightMirror=createMirror(root.right);
        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }

    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={4,6,8,2,5,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
           root=insert(root, values[i]);
        }
        preorder(root);
        System.out.println();
       createMirror(root);
       preorder(root);
    

    }

}
   

