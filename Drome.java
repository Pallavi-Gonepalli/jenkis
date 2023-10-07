public class PalindromeNumberChecker {
    public static void main(String[] args) {
        int number = 121;
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        // Convert the number to a string
        String numStr = String.valueOf(number);

        // Compare with its reverse
        StringBuilder reversed = new StringBuilder(numStr).reverse();
        return numStr.equals(reversed.toString());
    }
}
