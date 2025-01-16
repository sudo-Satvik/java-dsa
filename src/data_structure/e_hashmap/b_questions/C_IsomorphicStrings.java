package data_structure.e_hashmap.b_questions;

import java.util.HashMap;

// Isomorphic String means some character is replacing all the character of the string, or we can say encoding
// eg: aabcdcd => xxyzwzw where a = x, b = y, c = z, d = w
public class C_IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char val = t.charAt(i);
            if (mp.containsKey(key)) {
                if (mp.get(key) != val)
                    return false;
            }
            else if (mp.containsValue(val)) return false;
            else mp.put(key, val);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s, t));
    }
}
