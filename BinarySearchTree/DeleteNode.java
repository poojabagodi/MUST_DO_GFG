package BinarySearchTree;

public class DeleteNode {
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

     public static Node delete(Node root,int key){
        if (root == null) return null;

        if(root.data<key){
            root.right= delete(root.right, key);
        }
        else if(root.data>key){
            root.left= delete(root.left, key);
        }
        else{
            //case1
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                Node is=findInorder(root.right);
                root.data=is.data;
                root.right=delete(root.right, is.data);
            }
        }
        return root;
     }

     public static Node findInorder(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
     }

public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
      
        System.out.print(root.data+" ");
        inorder(root.right);

    }
     public static void main(String[] args) {
        int values[]={4,5,6,8,2,5,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
           root=insert(root, values[i]);
        }
       inorder(root);
         
        delete(root, 5);
        
        inorder(root);

    }

}
