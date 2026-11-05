class Solution {
    public static void main (String[] args) {
        int number = 121;
        System.out.println(number + (isPalindrome(number) ? " is" : " is not") + " a palindrome number.");
    }

    static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        int original = number;
        int reversed = 0;

        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        return original == reversed;
    }
}