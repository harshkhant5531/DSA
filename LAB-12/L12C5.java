package L12C5;


//THis Code Doesnt Works Properly :-<



import java.util.HashMap;
import java.util.Scanner;

class Node {
    String data;
    int inStock;
    Node link;

    Node(String data, int inStock) {
        this.data = data;
        this.inStock = inStock;
        this.link = null;
    }
}

class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(String data, int inStock) {
        Node newNode = new Node(data, inStock);
        if (isEmpty()) {
            head = newNode;
            head.link = head;
        } else {
            Node current = head;
            while (current.link != head) {
                current = current.link;
            }
            current.link = newNode;
            newNode.link = head;
        }
    }

    public Node getNode(String data) {
        if (isEmpty()) return null;
        Node current = head;
        do {
            if (current.data.equals(data)) return current;
            current = current.link;
        } while (current != head);
        return null;
    }

    public Node getNode(int position) {
        if (isEmpty() || position <= 0) return null;
        Node current = head;
        int count = 1;
        while (current != null && count < position) {
            current = current.link;
            count++;
            if (current == head) return null;
        }
        return current;
    }

    public void merge(int n, int m) {
        Node nodeN = getNode(n);
        Node nodeM = getNode(m);
        if (nodeN == null || nodeM == null || nodeN == nodeM) return;

        String[] splitN = splitCode(nodeN.data);
        String[] splitM = splitCode(nodeM.data);

        if (!splitN[0].equals(splitM[0])) return;

        String newCode = (splitN[1].compareTo(splitM[1]) < 0) ? splitN[1] + splitM[1] : splitM[1] + splitN[1];
        nodeN.data = newCode;

        mergeSubCategories(nodeN, nodeM);

        removeNode(m);
    }

    private void mergeSubCategories(Node nodeN, Node nodeM) {
        // Method to merge sub-categories and sub-sub-categories
        String[] splitN = splitCode(nodeN.data);
        String[] splitM = splitCode(nodeM.data);

        CircularLinkedList subCatListN = L12C5.InventoryManagement.subCategories.get(splitN[0]);
        CircularLinkedList subCatListM = L12C5.InventoryManagement.subCategories.get(splitM[0]);

        if (subCatListN == null) {
            subCatListN = new CircularLinkedList();
        }
        if (subCatListM != null) {
            Node currentM = subCatListM.head;
            do {
                Node subCategory = subCatListN.getNode(currentM.data);
                if (subCategory == null) {
                    subCatListN.add(currentM.data, currentM.inStock);
                } else {
                    subCategory.inStock += currentM.inStock;
                }
                currentM = currentM.link;
            } while (currentM != subCatListM.head);
        }

        L12C5.InventoryManagement.subCategories.put(splitN[0], subCatListN);
    }

    private void removeNode(int position) {
        if (isEmpty()) return;
        if (position == 1) {
            if (head.link == head) {
                head = null;
            } else {
                Node current = head;
                while (current.link != head) {
                    current = current.link;
                }
                current.link = head.link;
                head = head.link;
            }
        } else {
            Node current = head;
            int count = 1;
            while (current.link != head && count < position - 1) {
                current = current.link;
                count++;
            }
            if (current.link == head) return;
            current.link = current.link.link;
        }
    }

    public void printAll() {
        if (isEmpty()) return;
        Node current = head;
        do {
            System.out.println(current.data + " " + current.inStock);
            current = current.link;
        } while (current != head);
    }

    public int getInStock(String code) {
        Node node = getNode(code);
        return (node != null) ? node.inStock : -1;
    }

    private String[] splitCode(String code) {
        return new String[]{code.substring(0, 2), code.substring(2, 4), code.substring(4)};
    }
}

public class L12C5 {
    public static class InventoryManagement {
        private CircularLinkedList mainCategories = new CircularLinkedList();
        static HashMap<String, CircularLinkedList> subCategories = new HashMap<>();
        private static HashMap<String, CircularLinkedList> subSubCategories = new HashMap<>();

        public static void main(String[] args) {
            InventoryManagement inventory = new InventoryManagement();
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            for (int i = 0; i < N; i++) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                String command = parts[0];

                switch (command) {
                    case "I":
                        String productCode = parts[1];
                        int stock = Integer.parseInt(parts[2]);
                        inventory.addStock(productCode, stock);
                        break;
                    case "M":
                        int n = Integer.parseInt(parts[1]);
                        int m = Integer.parseInt(parts[2]);
                        inventory.mergeCategories(n, m);
                        break;
                    case "S":
                        String code = parts[1];
                        System.out.println(inventory.getInStock(code));
                        break;
                    case "P":
                        inventory.printProducts();
                        break;
                }
            }
            scanner.close();
        }

        private void addStock(String productCode, int stock) {
            String[] codes = splitCode(productCode);
            String mainCat = codes[0];
            String subCat = codes[1];
            String subSubCat = codes[2];

            // Add stock to main category
            if (mainCategories.getNode(mainCat) == null) {
                mainCategories.add(mainCat, 0);
            }

            CircularLinkedList subCatList = subCategories.getOrDefault(mainCat, new CircularLinkedList());
            subCategories.put(mainCat, subCatList);

            // Add stock to sub-category
            if (subCatList.getNode(subCat) == null) {
                subCatList.add(subCat, 0);
            }

            CircularLinkedList subSubCatList = subSubCategories.getOrDefault(subCat, new CircularLinkedList());
            subSubCategories.put(subCat, subSubCatList);

            // Add stock to sub-sub-category
            Node subSubNode = subSubCatList.getNode(subSubCat);
            if (subSubNode == null) {
                subSubCatList.add(subSubCat, stock);
            } else {
                subSubNode.inStock += stock;
            }
        }

        private Node getMainCategory(String code) {
            return mainCategories.getNode(code);
        }

        private void mergeCategories(int n, int m) {
            mainCategories.merge(n, m);
        }

        private void printProducts() {
            for (CircularLinkedList list : subSubCategories.values()) {
                list.printAll();
            }
        }

        private String[] splitCode(String code) {
            return new String[]{code.substring(0, 2), code.substring(2, 4), code.substring(4)};
        }

        private int getInStock(String code) {
            if (code.length() == 6) {
                CircularLinkedList subSubCatList = subSubCategories.get(splitCode(code)[1]);
                if (subSubCatList != null) {
                    return subSubCatList.getInStock(code);
                }
            } else if (code.length() == 4) {
                CircularLinkedList subCatList = subCategories.get(splitCode(code)[0]);
                if (subCatList != null) {
                    return subCatList.getInStock(code);
                }
            } else if (code.length() == 2) {
                Node mainCatNode = mainCategories.getNode(code);
                if (mainCatNode != null) {
                    return mainCatNode.inStock;
                }
            }
            return -1;
        }
    }
}
