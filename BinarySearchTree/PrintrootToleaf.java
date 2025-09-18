package BinarySearchTree;
import java.util.*;
public class PrintrootToleaf {
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
    public static void roottoleaf(Node root,ArrayList<Integer> path){
        if(root==null) return;
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        roottoleaf(root.left, path);
        roottoleaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }

     public static void main(String[] args) {
        int values[]={4,5,6,8,2,5,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
           root=insert(root, values[i]);
        }
       ArrayList<Integer> path=new ArrayList<>();
        roottoleaf(root, path);
       
    

    }

}
