package Tree;

public class Isidentical {
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

    class BinaryTree{
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

        public boolean isIdentical(Node root,Node subroot){
            if(root==null && subroot==null){
                return true;
            }
            else if(root==null || subroot==null || root.data!=subroot.data){
                return false;

            }

            if(!isIdentical(root.left, subroot.left) || !isIdentical(root.right, subroot.right) ){
                return false;
            }
            return true;
        }


        public boolean issubtree(Node root,Node subroot){
            if(root==null){
                return false;
            }
            if(root.data==subroot.data){
                if(isIdentical(root, subroot)){
                    return true;
                }
            }
            return issubtree(root.left, subroot) || issubtree(root.right, subroot); 
        }
        
    }
}
