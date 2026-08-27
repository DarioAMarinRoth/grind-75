package week2;

public class W2E7 {

    static void main() {
        W2E7 solver = new W2E7();
        IO.println(solver.addBinary("11", "11"));
    }

    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();

        int diff = Math.abs(a.length() - b.length());
        if (a.length() > b.length()) {
            b = "0".repeat(diff).concat(b);
        } else {
            a = "0".repeat(diff).concat(a);
        }

        int carry = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            int digit1 = a.charAt(i) - '0';
            int digit2 = b.charAt(i) - '0';
            int aux = digit1 + digit2 + carry;
            carry = aux / 2;
            ans.append(aux % 2);
        }

        if (carry == 1) {
            ans.append(carry);
        }

        return ans.reverse().toString();
    }
}
