package Tree;
import java.util.*;
public class Topview {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    static class Info{
        Node node;
        int hd;
        Info(Node node,int hd){
             this.node=node;
             this.hd=hd;
        }
    }

   static class BinaryTree{
        int idx=-1;
        public Node buildtree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.right=buildtree(nodes);
            newnode.left=buildtree(nodes);
            return newnode;
        }

        public void topview(Node root){
         Queue<Info> q=new LinkedList<>();
         HashMap<Integer,Node> map=new HashMap<>();
         q.add(new Info(root,0));
         q.add(null);
       int min=0,max=0;
         while(!q.isEmpty()){
           Info curr=q.remove();
           if(curr==null){
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
           }
           else{
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node);
            }
            if(curr.node.left!=null){
                q.add(new Info(curr.node.left,curr.hd-1));
               min=Math.min(min,curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new Info(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
            }
           }
         }
         for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data);
         }
        }
    }
    
}
