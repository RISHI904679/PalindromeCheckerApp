class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class UseCase8PalindromeCheckerApp {

    // Function to check palindrome
    public static boolean isPalindrome(String str) {

        // Convert string to linked list
        Node head = new Node(str.charAt(0));
        Node temp = head;

        for (int i = 1; i < str.length(); i++) {
            temp.next = new Node(str.charAt(i));
            temp = temp.next;
        }

        // Find middle using slow and fast pointer
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null;
        Node current = slow;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Compare first half and reversed second half
        Node first = head;
        Node second = prev;

        while (second != null) {
            if (first.data != second.data) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
      return true;
    }

    public static void main(String[] args) {

        String input = "madam";
   if (isPalindrome(input)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}