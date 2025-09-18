package BinarySearchTree;

public class SortedarraytoBST {
   static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node createBST(int[] arr,int st,int en){
        if(st>en) return null;
        int mid=(st+en)/2;
        Node root=new Node(arr[mid]);
        root.left=createBST(arr, st, mid-1);
        root.right=createBST(arr, mid+1, en);
        return root;
    }
}
