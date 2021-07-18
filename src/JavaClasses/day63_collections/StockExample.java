package JavaClasses.day63_collections;

import java.util.Stack;

public class StockExample {
    public static void main(String[] args) {

        Stack<String> booksStack = new Stack<>();
        booksStack.add("Harry Potter");
        booksStack.add("Leaders eat lest");
        booksStack.add("Java intro");
        //booksStack.pop();

        System.out.println(booksStack);
        System.out.println(booksStack.remove(0));

        System.out.println("Final versions: " + booksStack);
        System.out.println("This is at the top of the stack: " + booksStack.peek());
    }
}
