package Tree;

public class AVLTree {
    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.height = 1; // new node has height = 1
        }
    }

    // Insert node into AVL tree
    public static Node insert(Node node, int key) {
        if (node == null) return new Node(key);

        if (key < node.data) {
            node.left = insert(node.left, key);
        } else if (key > node.data) {
            node.right = insert(node.right, key);
        } else {
            return node; // duplicate not allowed
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // LL
        if (balance > 1 && key < node.left.data) return rightRotate(node);

        // RR
        if (balance < -1 && key > node.right.data) return leftRotate(node);

        // LR
        if (balance > 1 && key > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && key < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Height helper
    public static int height(Node n) {
        return (n == null) ? 0 : n.height;
    }

    // Balance factor
    public static int getBalance(Node n) {
        return (n == null) ? 0 : height(n.left) - height(n.right);
    }

    // Right Rotate
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }

    // Left Rotate
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }

    // Traversals
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Main
    public static void main(String[] args) {
        int[] avl = {12, 42, 35, 64, 21, 11, 9, 14};
        Node root = null;
        for (int x : avl) {
            root = insert(root, x);
        }

        System.out.print("Inorder (sorted): ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder (AVL structure): ");
        preorder(root);
    }
}
