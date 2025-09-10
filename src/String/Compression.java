package String;


//Most importance
public class Compression {

    public static int compress(char[] chars) {
        int n = chars.length;
        int index = 0;  // Where we write the compressed characters

        for (int i = 0; i < n; ) {
            char currentChar = chars[i];
            int count = 0;

            // Count the occurrences of the current character
            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the character
            chars[index++] = currentChar;

            // If count > 1, write the digits of the count
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c'};
        int newLength = compress(chars);
        // Print compressed characters
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i]);
        }
    }
}
