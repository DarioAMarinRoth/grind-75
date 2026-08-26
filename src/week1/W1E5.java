package week1;

public class W1E5 {

    static void main() {
        IO.println(isPalindrome("9,8"));
    }



    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();
        StringBuilder reverseString = new StringBuilder();
        StringBuilder arg = new StringBuilder();
        for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
            if (isAlphanumeric(s.charAt(i))) {
                reverseString.append(s.charAt(i));
            }
            if (isAlphanumeric(s.charAt(j))) {
                arg.append(s.charAt(j));
            }
        }

        return reverseString.toString().contentEquals(arg);
    }

    private static boolean isAlphanumeric(char c) {
        // ASCII:
        // Números entre 48 y 57.
        // Minúsculas entre 97 y 122;
        return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z');
    }

}
