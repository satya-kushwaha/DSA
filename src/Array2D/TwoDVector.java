package Array2D;

import java.util.Vector;

public class TwoDVector {
    public static void main(String[] args) {
        // Create 2D Vector
        Vector<Vector<Integer>> vec2D = new Vector<>();

        // Create first row
        Vector<Integer> row1 = new Vector<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        // Create second row
        Vector<Integer> row2 = new Vector<>();
        row2.add(4);
        row2.add(5);

        // Add rows to 2D vector
        vec2D.add(row1);
        vec2D.add(row2);

        // Print 2D vector
        System.out.println(vec2D);

        // Access element (row 0, col 1 → 2)
        System.out.println("Element at (0,1): " + vec2D.get(0).get(1));

        // Add a new element to second row
        vec2D.get(1).add(6);

        // Print updated 2D vector
        System.out.println(vec2D);
    }
}
