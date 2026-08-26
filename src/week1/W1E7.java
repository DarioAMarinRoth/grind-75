package week1;

import java.util.HashMap;

public class W1E7 {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (letters.containsKey(c)) {
                letters.put(c, letters.get(c) + 1);
            } else {
                letters.put(c, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (!letters.containsKey(c)) {
                return false;
            }

            int aux = letters.get(c) - 1;
            if (aux == 0) {
                letters.remove(c);
            } else {
                letters.put(c, aux);
            }

        }

        return true;
    }
}
