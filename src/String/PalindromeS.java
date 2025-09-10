package String;

public class PalindromeS {

    boolean isAlphaNum(char ch) {
        return (ch >= '0' && ch <= '9') ||
                (ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z');
    }

    boolean palindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            // Skip non-alphanumeric from left
            if (!isAlphaNum(s.charAt(i))) {
                i++;
                continue;
            }

            // Skip non-alphanumeric from right
            if (!isAlphaNum(s.charAt(j))) {
                j--;
                continue;
            }

            // Compare after lowercasing
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false; // mismatch found
            }
            i++;
            j--;
        }
        return true; // all matched
    }

    public static void main(String[] args) {
        PalindromeS p = new PalindromeS();
        System.out.println(p.palindrome("RammaR"));      // true
        System.out.println(p.palindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(p.palindrome("race a car"));  // false
    }
}
