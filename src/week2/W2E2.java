package week2;

public class W2E2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chars = new int[127];

        for (char c : magazine.toCharArray()) {
            chars[c]++;
        }

        for (char c : ransomNote.toCharArray()) {
            chars[c]--;
            if (chars[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
