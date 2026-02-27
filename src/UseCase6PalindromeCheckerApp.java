import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" PALINDROME CHECKER APP - UC6 ");
        System.out.println("=================================");

        String word = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Enqueue and Push characters
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}