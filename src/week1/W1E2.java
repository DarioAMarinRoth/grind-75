package week1;

import java.util.Stack;

public class W1E2 {

    static void main() {
        W1E2 solver = new W1E2();
        IO.println(solver.isValid("([)]"));
    }

    Stack<Character> expectedCloseChar;

    public boolean isValid(String s) {
        expectedCloseChar = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isAnOpenChar(c)) {
                expectedCloseChar.push(getCloseChar(c));
                continue;
            }

            if (expectedCloseChar.isEmpty() || expectedCloseChar.pop() != c) {
                return false;
            }
        }
        return expectedCloseChar.isEmpty();
    }

    private boolean isAnOpenChar(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private char getCloseChar(char c) {
        return switch (c) {
            case '(' -> ')';
            case '[' -> ']';
            case '{' -> '}';
            default -> 0;
        };
    }


}
