package BinarySearchTree;

public class PrintInRange {
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

    public static void printRange(Node root,int k1,int k2){
        if(root==null) return;
        if(root.data>=k1 && root.data<=k2){
            printRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printRange(root.right, k1, k2);
        }
        else if(root.data<k1){
            printRange(root.left, k1, k2);
        
        }
        else{
            printRange(root.right, k1, k2);
        }
    }

    
     public static void main(String[] args) {
        int values[]={4,5,6,8,2,5,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
           root=insert(root, values[i]);
        }
       
    

    }

}
