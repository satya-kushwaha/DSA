package Tree;

import java.util.ArrayList;

import static Tree.BST.Node.*;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        //During insertion time complexity is O(H)
        public static Node insert(Node root,int data){
            if(root == null){
                root = new Node(data);
                return root;
            }
            if(root.data > data){
                //left subtree
                root.left = insert(root.left,data);
            }else {
                root.right = insert(root.right,data);
            }
            return root;
        }
        public static boolean searchInBST(Node root,int key){
            if(root == null){
                return false;
            }
            if(root.data > key){
                return  searchInBST(root.left,key);//left subtree
            }else if (root.data == key){
                return true;
            }else {
                return searchInBST(root.right,key);//right subtree
            }
        }
    }
    //Deletion of Node
    public static Node deleteNode(Node root,int val){
        if(root == null){
            return null;
        }
        if(root.data > val){
          root.left =   deleteNode(root.left,val);
        } else if (root.data < val) {
            root.right = deleteNode(root.right,val);
        }else if (root.data == val){
            //case 1
            if(root.left == null && root.right ==null){
                return  null;
            }
            //case 2
            if (root.left == null  ){
                return  root.right;
            } else if (root.right == null){
                return  root.left;
            }
            //case 3
            Node is = inOrderSuc(root.right);
            root.data = is.data;
            root.right = deleteNode(root.right,is.data);
        }
        return root;
    }
    public static void inOderT(Node root){
        inOderT(root.left);
        System.out.print(root.data+" ");
        inOderT(root.right);
    }
    public static Node inOrderSuc(Node root){
        while (root.left != null){
            root = root.left;
        }
       return  root;
    }
    //Root of left path
    public static  void  printRoot2Leaf(Node root,ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        // leaf
        if (root.left == null && root.right == null){
            printPaht(path);
        }else {// non leaf
            printRoot2Leaf(root.left,path);
            printRoot2Leaf(root.right,path);
        }
        path.remove(path.size()-1);
    }
    public static void printPaht(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int values[] = {5,1,3,4,2,7};
//        int values[] = {8,5,3,1,4,6,10,11,14};
        int values[] = {8,5,3,6,10,11,14};//tree print root to leaf
        Node root = null;
        BST b = new BST();
        for(int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }
        inOderT(root);
        System.out.println();
//        System.out.println(searchInBST(root,143));
//        deleteNode(root,4);//No chile 4 one chile  11 tow chile 5
//        inOderT(root);
        printRoot2Leaf(root,new ArrayList<Integer> ());
    }
}
