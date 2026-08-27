package week2;

public class W2E4 {
    public int longestPalindrome(String s) {
        int firstChar = 'A';
        int lastChar = 'z';
        int[] chars = new int[lastChar + 1];

        for (char c : s.toCharArray()) {
            chars[c]++;
        }

        boolean odd = false;
        int length = 0;
        for (int i = firstChar; i <= lastChar ; i++) {

            if (chars[i] % 2 != 0) {
                odd = true;
                length += chars[i] - 1;
            } else {
              length += chars[i];
            }
        }

        return odd ? length + 1 : length;
    }
}
