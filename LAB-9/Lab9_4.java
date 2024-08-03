import java.util.Stack;

public class Lab9_4 {
    public static void main(String[] args) {
        Stack<String> fStack = new Stack<>();

        String[] queries = { "buy_red", "buy_blue", "buy_green", "fetch", "fetch", "buy_yellow", "fetch", "fetch",
                "fetch", "fetch" };

        for (String query : queries) {
            if (query.startsWith("buy_")) {
                String color = query.substring(4);
                fStack.push(color);
                System.out.println("Added " + color + " feather to the top.");
            } else if (query.equals("fetch")) {
                if (fStack.isEmpty()) {
                    System.out.println("No feathers in the suitcase!");
                } else {
                    String bottomFeather = fStack.remove(0);
                    System.out.println("Picked " + bottomFeather + " feather from the bottom.");
                    fStack.push(bottomFeather);
                }
            }
        }
    }
}
