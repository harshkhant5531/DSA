public class L15B1 {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 4, 5, 10, 7 };
        Node root = null;
        BST tree = new BST();
        // Building the tree
        for (int i = 0; i < arr.length; i++) {
            root = tree.insert(root, arr[i]);
        }
        tree.smallestElement(root);
        tree.largestElement(root);
    }
}

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

class BST {
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

    public void smallestElement(Node root) {
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        System.out.println("Smallest Element is: " + temp.data);
    }

    public void largestElement(Node root) {
        Node temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        System.out.println("Largest Element is: " + temp.data);
    }
}