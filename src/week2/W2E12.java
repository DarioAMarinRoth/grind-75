package week2;

public class W2E12 {

    static void main() {
        W2E12 solver = new W2E12();
        IO.println(solver.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;

        for (int num : nums) {

            if (currentSum < 0 && num > currentSum) {
                currentSum = num;
            } else {
                currentSum += num;
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

        }

        return maxSum;
    }
}
