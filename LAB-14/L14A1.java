class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {
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

    public boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.data > key)
            return search(root.left, key);
        else if (root.data == key)
            return true;
        else
            return search(root.right, key);
    }

    public Node delete(Node root, int key) {
        if (root == null) return null;

        if (root.data > key) {
            root.left = delete(root.left, key);
        } else if (root.data < key) {
            root.right = delete(root.right, key);
        } else {
           
            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node inorderSuccessor = root.right;
            while (inorderSuccessor.left != null) {
                inorderSuccessor = inorderSuccessor.left;
            }
            root.data = inorderSuccessor.data;
            root.right = delete(root.right, inorderSuccessor.data);
        }
        return root;
    }

    public void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

public class L14A1 {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        BST tree = new BST();
        for (int i = 0; i < arr.length; i++) {
            root = tree.insert(root, arr[i]);
        }
        tree.inorder(root);
        System.out.println("\nIs 7 present in BST: " + tree.search(root, 7));
        System.out.println("Is 8 present in BST: " + tree.search(root, 8));
        System.out.println("Before: ");
        tree.inorder(root);
        tree.delete(root,5);
        System.out.println("\nAfter: ");
        tree.inorder(root);
    }
}
