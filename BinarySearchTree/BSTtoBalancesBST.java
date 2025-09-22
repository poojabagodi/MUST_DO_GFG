package BinarySearchTree;
import java.util.*;
public class BSTtoBalancesBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
   
    public static void getInorder(Node root,ArrayList<Integer> inorder){
        if(root==null) return;
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);

    }
      public static Node createBST(ArrayList<Integer> arr,int st,int en){
        if(st>en) return null;
        int mid=(st+en)/2;
        Node root=new Node(arr.get(mid));
        root.left=createBST(arr, st, mid-1);
        root.right=createBST(arr, mid+1, en);
        return root;
    }

    public static Node balancedBST(Node root){
        ArrayList<Integer> inorder=new ArrayList<>();
        getInorder(root, inorder);
        root=createBST(inorder, 0, inorder.size()-1);
        return root;
    }


}
