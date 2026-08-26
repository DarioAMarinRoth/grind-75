package week1;

public class W1E8 {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;


        while (l <= r) {
            int i = (r + l) / 2;
            int value = nums[i];

            if (value == target) {
                return i;
            } else if (value > target) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }

        return -1;
    }
}
