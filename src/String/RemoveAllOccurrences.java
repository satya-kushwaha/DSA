package String;

// a= abcabbccd part abc
public class RemoveAllOccurrences {
    public static void main(String[] args) {
        String str = "abcabbccd";
        String part = "abc";

        while (str.contains(part)) {
            str = str.replace(part, ""); // remove all occurrences
        }

        System.out.println(str); // Output: "bbccd"

    }
}
