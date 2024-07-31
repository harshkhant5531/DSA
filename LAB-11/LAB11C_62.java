
public class LAB11C_62 {
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
    
    public static void remove_duplicates() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head.next == null) {
            return;
        }
        Node current = head;
        
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LAB11C_62 rd1 = new LAB11C_62();

        rd1.addLast(0);
        rd1.addLast(1);
        rd1.addLast(2);
        rd1.addLast(2);
        rd1.addLast(4);
        rd1.addLast(0);

        remove_duplicates();
        rd1.printData();
    }

}