// Algorithm: Maximum Subarray Sum
// Runtime: O(n)
// use:
// - find maximum sum of the element of a given array (maximum subarray sum)

public class MaximumSubarraySum {

    public static void main(String[] args) {
        int[] A = {2, 4, 5, -1, -10, 1, 50};

        System.out.println(maxSubarraySum(A));
    }

    static int maxSubarraySum(int[]A) {
        int randmax = 0, max = 0;

        for (int i = 0; i < A.length; i++) {
            randmax = Math.max(A[i], randmax + A[i]);
            max = Math.max(max, randmax);
        }

        return max;
    }
}
