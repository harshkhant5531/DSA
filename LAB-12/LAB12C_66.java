public class LAB12C_66 {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void addLast(int data) {
        Node n2 = new Node(data);

        if (head == null) {
            head = n2;
            return;
        } 
        else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n2;

        }
    }

    public void printData(){
        Node temp = head;

        if(head == null){
           System.out.println("Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void swapNode(int k){
        Node slow = head;
        Node fast = head;
        Node kth = null;


        for(int i = 0; i<k-1; i++){
            fast = fast.next;
        }
        kth = fast;

        while (fast.next!= null) {
            slow = slow.next;
            fast = fast.next;
        }
        int temp = kth.data;
        kth.data = slow.data;
        slow.data = temp;
    }

    public static void main(String[] args) {
        LAB12C_66 l1 = new LAB12C_66();

        l1.addLast(0);
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(6);
        l1.addLast(7);
        l1.addLast(8);
        l1.addLast(9);
        l1.addLast(10);

        l1.swapNode(3);
        l1.printData();
    }
}