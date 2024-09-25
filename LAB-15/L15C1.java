class Node {
    String name;
    String phoneNumber;
    Node left, right;

    // Constructor
    Node(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.left = this.right = null;
    }
}

class PhoneBookDictionary {
    public Node root;

    PhoneBookDictionary() {
        this.root = null;
    }

    // Add a new entry
    public void addEntry(String name, String phoneNumber) {
        root = addEntryRec(root, name, phoneNumber);
    }

    private Node addEntryRec(Node root, String name, String phoneNumber) {
        if (root == null) {
            root = new Node(name, phoneNumber);
            return root;
        }
        if (name.compareTo(root.name) < 0) {
            root.left = addEntryRec(root.left, name, phoneNumber);
        } else if (name.compareTo(root.name) > 0) {
            root.right = addEntryRec(root.right, name, phoneNumber);
        }
        return root;
    }

    // Delete an entry
    public void deleteEntry(String name) {
        root = deleteEntryRec(root, name);
    }

    private Node deleteEntryRec(Node root, String name) {
        if (root == null) return root;

        if (name.compareTo(root.name) < 0) {
            root.left = deleteEntryRec(root.left, name);
        } else if (name.compareTo(root.name) > 0) {
            root.right = deleteEntryRec(root.right, name);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            root.name = minValue(root.right);
            root.right = deleteEntryRec(root.right, root.name);
        }
        return root;
    }

    private String minValue(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.name;
    }

    // Search for a phone number by name
    public String searchPhoneNumber(String name) {
        Node res = searchRec(root, name);
        return res != null ? res.phoneNumber : "Not found";
    }

    private Node searchRec(Node root, String name) {
        if (root == null || root.name.equals(name)) {
            return root;
        }
        if (name.compareTo(root.name) < 0) {
            return searchRec(root.left, name);
        }
        return searchRec(root.right, name);
    }

    // List all entries in ascending order of name
    public void listAscending() {
        listAscendingRec(root);
    }

    private void listAscendingRec(Node root) {
        if (root != null) {
            listAscendingRec(root.left);
            System.out.println("Name: " + root.name + ", Phone: " + root.phoneNumber);
            listAscendingRec(root.right);
        }
    }

    // List all entries in descending order of name
    public void listDescending() {
        listDescendingRec(root);
    }

    private void listDescendingRec(Node root) {
        if (root != null) {
            listDescendingRec(root.right);
            System.out.println("Name: " + root.name + ", Phone: " + root.phoneNumber);
            listDescendingRec(root.left);
        }
    }
}

public class L15C1 {
    public static void main(String[] args) {
        PhoneBookDictionary phoneBook = new PhoneBookDictionary();

        // Adding entries
        phoneBook.addEntry("Alice", "12345");
        phoneBook.addEntry("Bob", "67890");
        phoneBook.addEntry("Charlie", "54321");

        // Searching for a phone number
        System.out.println("Phone number for Bob: " + phoneBook.searchPhoneNumber("Bob"));

        // Listing entries in ascending order
        System.out.println("\nPhone book in ascending order:");
        phoneBook.listAscending();

        // Listing entries in descending order
        System.out.println("\nPhone book in descending order:");
        phoneBook.listDescending();

        // Deleting an entry
        phoneBook.deleteEntry("Alice");
        System.out.println("\nPhone book after removing Alice:");
        phoneBook.listAscending();
    }
}