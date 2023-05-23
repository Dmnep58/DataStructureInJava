package Problems;


import java.util.Arrays;

public class MinimumMaximumShareAllocation {

    public static int[] findMinMaxShares(int[] blocks, int p) {
        // Sort the blocks of shares in ascending order
        Arrays.sort(blocks);

        // Calculate the cumulative sum of shares from the sorted blocks
        int[] cumSum = new int[blocks.length];
        int totalShares = 0;
        for (int i = 0; i < cumSum.length; i++) {
            totalShares += blocks[i];
            cumSum[i] = totalShares;
        }

        // Find the index where cumulative sum becomes greater than or equal to p
        int minSharesIndex = -1;
        for (int i = 0; i < cumSum.length; i++) {
            if (cumSum[i] >= p) {
                minSharesIndex = i;
                break;
            }
        }

        // Find the index where cumulative sum becomes strictly greater than p
        int maxSharesIndex = -1;
        for (int i = 0; i < cumSum.length; i++) {
            if (cumSum[i] > p) {
                maxSharesIndex = i;
                break;
            }
        }

        // Return the minimum and maximum shares
        int[] result = new int[2];
        result[0] = cumSum[minSharesIndex];
        result[1] = cumSum[maxSharesIndex];
        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] blocks = {4,5,26,13,10,3};
        int p = 100;
        int[] minMaxShares = findMinMaxShares(blocks, p);
        System.out.println("Minimum shares: " + minMaxShares[0]);
        System.out.println("Maximum shares: " + minMaxShares[1]);
    }
}
