package Tree;
import java.util.*;
public class Buildtree {
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


       static class binarytree{
        static int  idx=-1;
        public  Node buildtree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);
            return newnode;
        }

        public  void preorder(Node root){
            if(root==null){
                return;

            }
            System.out.println(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }


        public  void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        }


        public  void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);  
            System.out.println(root.data+" ");
        }
        

        public void levelorder(Node root){
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node curr=q.remove();
                if(curr==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(curr.data+" ");
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }
        }


        public int Height(Node root){
            if(root==null){
                return 0;
            }
            int lh=Height(root.left);
            int rh=Height(root.right);
            return Math.max(lh,rh)+1;


        }

        public int countofnodes(Node root){
            if(root==null){
                return 0;
            }
            int lc=countofnodes(root.left);
            int rc=countofnodes(root.right);
            return lc+rc+1;
        }

        public int sumnodes(Node root){
            if(root==null){
                return 0;
            }
            int ls=sumnodes(root.left);
            int rs=sumnodes(root.right);
            return ls+rs+root.data;
        }

    }


    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       binarytree tree=new binarytree();
       Node root=tree.buildtree(nodes);
       System.out.println(root.data);
      // System.out.println("preorder");
        //    tree.preorder(root);
        //    System.out.println("inorder");
        //    tree.inorder(root);
        //    System.out.println("postorder");
        //    tree.postorder(root);
              System.out.println("levelorder");
              tree.levelorder(root);
    }
}
