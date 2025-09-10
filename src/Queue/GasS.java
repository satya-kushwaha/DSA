package Queue;

// Gas Station Problem - Greedy Approach
public class GasS {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        int result = canCompleteCircuit(gas, cost);
        System.out.println("Starting station index: " + result);
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0;

        // Step 1: Check overall feasibility
        for (int g : gas) totalGas += g;
        for (int c : cost) totalCost += c;


        // Step 2: Greedy check for valid start
        int start = 0, currGas = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost = cost[i];
            currGas += (gas[i] - cost[i]);
            if (currGas < 0) {
                // Cannot reach station i+1 from start → reset start
                start = i + 1;
                currGas = 0;
            }
        }
        if (totalGas < totalCost) {
            return -1; // Not possible
        }
        System.out.println(start);
        return start;

    }
}
