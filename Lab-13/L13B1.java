class LinkedList {
    class Node {
        int data;
        Node lptr;
        Node rptr;

        Node(int data) {
            this.data = data;
            this.lptr = null;
            this.rptr = null;
        }
    }

    public Node left = null;
    public Node right = null;

    public void insertNode(int data) {
        Node newNode = new Node(data);
        if (right == null) {
            left = newNode;
            right = newNode;
        } else {
            right.rptr = newNode;
            newNode.lptr = right;
            right = newNode;
        }
    }

    public void deleteAlternate() {
        if (left == null || left == right) return; 
        Node current = left;
        while (current != null && current.rptr != null) {
            Node nodeToDelete = current.rptr; 
            current.rptr = nodeToDelete.rptr; 
            if (nodeToDelete.rptr != null) {
                nodeToDelete.rptr.lptr = current; 
                right = current; 
            }
            current = current.rptr; 
        }
    }

    public void display() {
        if (left == null) {
            System.out.println("List is empty.");
        } else {
            Node current = left;
            while (current != null) {
                System.out.print(current.data + " <-> ");
                current = current.rptr;
            }
            System.out.println("null");
        }
    }
}

public class L13B1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);
        list.insertNode(6);

        System.out.println("Original List:");
        list.display();

        list.deleteAlternate();

        System.out.println("List after deleting alternate nodes:");
        list.display();
    }
}
