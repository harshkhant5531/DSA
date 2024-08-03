public class LAB10C_58 {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;

    public void printData(){
        Node temp = head;

        if(head == null){
           System.out.println("Empty");
            return;
        }

        while (temp.next != head) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("Head");
    }

    public void addLast(int data){
        Node n1 = new Node(data);

        if(head == null){
            n1.next = n1;
            head = n1;
            tail = n1;
        }

        tail.next = n1;
        n1.next = head;
        tail = n1;
    }

    public int count(){
        Node temp = head;

        if (head == null)return 0;
        if(head.next == head)return 1;

        int cnt = 1;

        while(temp.next != head){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        LAB10C_58 cn = new LAB10C_58();
        cn.addLast(0);
        cn.addLast(1);
        cn.addLast(2);
        cn.addLast(3);
        cn.addLast(4);
        cn.addLast(5);

        System.out.println(cn.count());
        
    }
}



