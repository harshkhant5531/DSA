import java.util.Scanner;

public class Lab15_1_LAB {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of nodes
        System.out.println("Enter number of nodes");
        int n = sc.nextInt();  // Read the number of nodes

        // Initialize arrays to store preorder and postorder traversals
        int[] pre = new int[n];
        int[] post = new int[n];

        // Read the preorder traversal from user input
        System.out.println("Enter Preorder Traversal");
        for (int i = 0; i < n; i++) {
            pre[i] = sc.nextInt();
        }

        // Read the postorder traversal from user input
        System.out.println("Enter Postorder Traversal");
        for (int i = 0; i < n; i++) {
            post[i] = sc.nextInt();
        }

        // Create an instance of ConstructBTree to construct the binary tree
        ConstructBTree cb = new ConstructBTree();
        TreeNode root = cb.constructFromPrePost(pre, post);

        // Create an instance of BSTTree to print the tree
        BSTTree btree = new BSTTree();
        btree.preOrder(root);  // Perform preorder traversal and print the nodes

        // Close the Scanner
        sc.close();
    }
}

// Class to construct a binary tree from preorder and postorder traversals
class ConstructBTree {
    int preIndex;
    int posIndex;

    // Constructor to initialize indices
    public ConstructBTree() {
        preIndex = 0;
        posIndex = 0;
    }

    // Method to construct the binary tree from preorder and postorder arrays
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        // Create a new node with the current value in preorder traversal
        TreeNode root = new TreeNode(pre[preIndex++]);
        
        // If the root's data does not match the current postorder value, construct the left subtree
        if (root.data != post[posIndex])
            root.left = constructFromPrePost(pre, post);
        
        // If the root's data does not match the current postorder value, construct the right subtree
        if (root.data != post[posIndex])
            root.right = constructFromPrePost(pre, post);
        
        // Increment the postorder index
        posIndex++;
        
        // Return the constructed tree node
        return root;
    }
}