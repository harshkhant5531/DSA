import java.util.ArrayList;
import java.util.Collections;

class LinkedList {
    class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    private Node first = null;

    public void append(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        } else {
            Node current = first;
            while (current.link != null) {
                current = current.link;
            }
            current.link = newNode;
        }
    }

    public void printList() {
        if (first == null) {
            System.out.println("List is empty");
        } else {
            Node current = first;
            while (current != null) {
                System.out.print(current.data + "->");
                current = current.link;
            }
            System.out.println("null");
        }
    }

    public void sortList() {
        if (first == null) {
            System.out.println("Cannot sort an empty linked list");
            return;
        }

        ArrayList<Integer> dataList = new ArrayList<>();
        Node current = first;

        while (current != null) {
            dataList.add(current.data);
            current = current.link;
        }

        Collections.sort(dataList);

        current = first;
        int index = 0;
        while (current != null) {
            current.data = dataList.get(index);
            index++;
            current = current.link;
        }
    }
}

public class L12B1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(4);
        list.append(7);
        list.append(8);
        list.append(2);
        list.append(1);

        System.out.println("Original List:");
        list.printList();

        list.sortList();
        System.out.println("Sorted List:");
        list.printList();
    }
}
