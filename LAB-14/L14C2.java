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

class BST4 {
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

    // Method to check if two subtrees are mirror images (symmetric)
    public boolean isTreeSymmetric(Node n1, Node n2) {
        if (n1 == null && n2 == null) {
            return true;
        }
        if (n1 == null || n2 == null) {
            return false;
        }
        return (n1.data == n2.data) && 
               isTreeSymmetric(n1.left, n2.right) && 
               isTreeSymmetric(n1.right, n2.left);
    }

    public boolean isSymmetric(Node root) {
        if (root == null) {
            return true; // An empty tree is symmetric
        }
        return isTreeSymmetric(root.left, root.right);
    }
}

public class L14C2 {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 3, 4, 4, 7, 7 };

        Node root1 = null;

        BST4 tree1 = new BST4();

        // Building the tree
        for (int i = 0; i < arr.length; i++) {
            root1 = tree1.insert(root1, arr[i]);
        }
        System.out.println("Is the tree symmetric? " + tree1.isSymmetric(root1));
    }
}
