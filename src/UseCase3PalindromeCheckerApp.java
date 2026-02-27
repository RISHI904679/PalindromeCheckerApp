public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" PALINDROME CHECKER APP - UC3 ");
        System.out.println("=================================");

        String original = "level";
        String reversed = "";

        // Reverse using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare using equals()
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        System.out.println("Program Ended.");
    }
}