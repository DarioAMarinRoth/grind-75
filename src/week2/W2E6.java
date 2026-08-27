package week2;

import java.util.HashMap;

public class W2E6 {

    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count = num == candidate ? count + 1 : 0;
        }
        return candidate;
    }
}
