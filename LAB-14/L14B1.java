class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize a new node
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST2 {
    // Method to insert data into the BST
    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (root.data > data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Pre-order traversal: root, left, right
    public void preorder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // In-order traversal: left, root, right
    public void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Post-order traversal: left, right, root
    public void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}

public class L14B1 {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        BST2 tree = new BST2();
        for (int i = 0; i < arr.length; i++) {
            root = tree.insert(root, arr[i]);
        }
        System.out.println("PreOrder:");
        tree.preorder(root);
        System.out.println("\nInOrder:");
        tree.inorder(root);
        System.out.println("\nPostOrder:");
        tree.postorder(root);
    }
}
