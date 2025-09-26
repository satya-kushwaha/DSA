package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryT {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left= null;
            this.right = null;
        }
    }
    static class binaryTree{
        static  int indx = -1;
        public static Node buildTree(int node[]){
            indx++;
            if(node[indx] == -1){
                return null;
            }
            Node newNode = new Node(node[indx]);
            newNode.left= buildTree(node);
            newNode.right= buildTree(node);
            return newNode;
        }
    }
    //Preorder Traversal -> Root -> left subtree -> right subtree
    public static void preOrder(Node root){
        if (root == null){
//            System.out.print(",-1");
            return;
        }
        System.out.print(root.data+",");
        preOrder(root.left);
        preOrder(root.right);
    }
    //InOrder Traversal ->left subtree -> root ->right subtree
    public static void inorderT(Node root){
        if(root == null){
            return;
        }
        inorderT(root.left);
        System.out.print(root.data+"->");
        inorderT(root.right);
    }
    //PostOrder Traversal left subtree -> right subtree -> root
    public static  void postOrder(Node root){
        if(root== null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+"->");
    }
    //Level Order Traversal (VVI)
    public static  void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currNode = q.remove();
            //next line
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else {
                // actual data
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);

                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }
    //Count Of Nodes
    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNode = countOfNodes(root.left);
        int rightNode = countOfNodes(root.right);
        return  leftNode + rightNode +1;
    }
    //Sum of Node
    public static int sumOfNode(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);

        return leftSum+rightSum + root.data;
    }
    //Height of a tree
    public static int heightOfT(Node root){
        if(root == null){
            return 0;
        }
        int lefthei = heightOfT(root.left);
        int righthei = heightOfT(root.right);
        if(lefthei>righthei){
            return lefthei+1;
        }else {
            return righthei +1;
        }
    }
    // Diameter of a Tree  (VVI)
    public static  int diameter(Node root){
        if(root == null){
            return 0;
        }
//        Approach 1 : O(N^2)
        int liftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        int diam3= heightOfT(root.left) + heightOfT(root.right) +1;
        return Math.max(diam3,Math.max(liftDia,rightDia));

    }
    //      Diameter of a Tree  (VVI)   Approach : 2 O(N)
    static  class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht  = ht;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root == null){
            return  new  TreeInfo (0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht,right.ht)+1;

        int diam1=left.diam;
        int diam2 =right.diam;
        int diam3 =left.ht + right.ht +1;

        int mydiam = Math.max(Math.max(diam1,diam2),diam3);

        TreeInfo myInfo = new TreeInfo(myHeight,mydiam);
        return myInfo;
    }
    //Subtree of another tree // Not  successful
    public static boolean SubtreeOfAnother(Node root,Node subRoot){
        if (subRoot == null){
            return true;
        }
        if (root == null){
            return false;
        }
        if (root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isIdentical(root.left,subRoot) || isIdentical(root.right,subRoot);
    }
    public static  boolean isIdentical(Node root,Node subroot){
        if(root == null && subroot == null){
            return  true;
        }
        if (root == null || subroot == null){
            return false;
        }
        if(root.data == subroot.data ){
            return isIdentical(root.left,subroot) && isIdentical(root.right,subroot);
        }
        return false;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int subtree[]={5,-1,-1};//wrong1
        binaryTree b = new binaryTree();
        Node root = binaryTree.buildTree(nodes);
//        Node subtre = binaryTree.buildTree(subtree);//wrong 2
//        System.out.println(root.data);
//        preOrder(root);
//        inorderT(root);
//        postOrder(root);
//        levelOrder(root);
//        System.out.println(countOfNodes(root));
//        System.out.println(sumOfNode(root));
//        System.out.println(heightOfT(root));
//        System.out.println(diameter2(root).diam );
//        System.out.println(isIdentical(root,subtre));// wrong 3
    }
}
