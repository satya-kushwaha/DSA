package Queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//First Unique Character in String

public class FUCIString {
    public static void main(String[] args) {
        HashMap<Character, Integer> m = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String:");
        String chara = scanner.nextLine();  // ✅ use nextLine() not toString()

        // Count frequencies & track positions
        for (int i = 0; i < chara.length(); i++) {
            char c = chara.charAt(i);

            // Update frequency
            m.put(c, m.getOrDefault(c, 0) + 1);

            // Add index to queue if character seen first time
            if (m.get(c) == 1) {
                q.add(i);
            }

            // Remove from queue while front char is repeated
            while (!q.isEmpty() && m.get(chara.charAt(q.peek())) > 1) {
                q.remove();
            }
        }

        // Print result
        if (q.isEmpty()) {
            System.out.println("No unique character found (-1)");
        } else {
            System.out.println("First unique character: " + chara.charAt(q.peek()));
        }
    }
}
