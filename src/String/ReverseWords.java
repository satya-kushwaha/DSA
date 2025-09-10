package String;

public class ReverseWords {
    public static void main(String[] args) {
        String ram = "The sky is blue";

        /* // Step 1: Split sentence into words
        String[] words = sentence.split(" ");

        // Step 2: Build the reversed sentence using StringBuilder
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }

        System.out.println(reversedSentence.toString());*/

        String ans = "";
        int end = ram.length() - 1;

        // Step 1: Reverse the whole string
        String reversedString = "";
        for (int i = end; i >= 0; i--) {
            reversedString += ram.charAt(i);
        }

        System.out.println("Reversed String: " + reversedString);

        // Step 2: Extract words from reversed string and reverse each word back
        String finalAns = "";
        int i = 0;
        int n = reversedString.length();

        while (i < n) {
            String word = "";

            // Collect characters of a word
            while (i < n && reversedString.charAt(i) != ' ') {
                word += reversedString.charAt(i);
                i++;
            }

            // Reverse the word back to correct order
            String correctWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                correctWord += word.charAt(j);
            }

            // Append the word to final answer
            finalAns += correctWord + " ";

            // Skip the space
            i++;
        }

        // Trim extra space at the end
        finalAns = finalAns.trim();

        System.out.println("Reversed Words Sentence: " + finalAns);
    }
}
