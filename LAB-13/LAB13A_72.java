class DLL {
    class Node {
        int info;
        Node lptr;
        Node rptr;

        Node(int data) {
            this.info = info;
            this.lptr = null;
            this.rptr = null;

        }
    }

    public Node right = null;
    public Node left = null;
    public Node middle = null;

    public void DOU_INS(int data) {
        Node newNode = new Node(data);
        newNode.info = data;
        if (right == null) {
            newNode.lptr = null;
            newNode.rptr = null;
            left = newNode;
            right = newNode;
        }
        if (middle == left) {
            newNode.lptr = null;
            newNode.rptr = middle;
            middle.lptr = newNode;
            left = newNode;
        }

    }
}

public class LAB13A_72 {
    public static void main(String[] args) {

    }
}
