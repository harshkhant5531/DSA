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

class BST3 {
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

    // Method to check if two trees are identical
    public boolean areBothTreeSame(Node n1, Node n2) {
        if (n1 == null && n2 == null)
            return true;
        else if (n1 == null || n2 == null)
            return false;
        else
            return (n1.data == n2.data) && (areBothTreeSame(n1.left, n2.left)) && (areBothTreeSame(n1.right, n2.right));
    }
}

public class L14C1 {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 3, 4, 2, 7 };
        int[] arr2 = { 5, 1, 3, 4, 2, 7 };

        Node root1 = null;
        Node root2 = null;

        BST3 tree1 = new BST3();
        BST3 tree2 = new BST3();

        // Building the first tree
        for (int i = 0; i < arr.length; i++) {
            root1 = tree1.insert(root1, arr[i]);
        }

        // Building the second tree
        for (int i = 0; i < arr2.length; i++) {
            root2 = tree2.insert(root2, arr2[i]);
        }

        // Check if both trees are the same
        System.out.println("Are Both trees Same: " + tree1.areBothTreeSame(root1, root2));
    }
}
