package Day4;

public class LeetCode_9_IsPalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0))
        {
            return false;
        }
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return (x == reversed) || (x == reversed / 10);

    }
}
