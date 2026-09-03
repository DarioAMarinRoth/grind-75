package week2;


import java.util.HashSet;
import java.util.Set;

public class W2E11 {

    static void main() {
        W2E11 solver = new W2E11();
        IO.println(solver.containsDuplicate(new int[]{1000000000,1000000000,11}));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();

        if (nums.length % 2 != 0) {
            values.add(nums[nums.length / 2]);
        }

        for (int i = 0; i < nums.length / 2; i++) {
            if (!values.add(nums[i]) || !values.add(nums[nums.length - 1 - i])) {
                return true;
            }
        }
        return false;
    }
}
