package data_structure.e_hashmap.b_questions;
import java.util.*;
/** @Quest: Check whether two strings are valid anagrams or not. Return true if they are else false.
 * @Anagram: An anagram of a string is another string that contains the same characters, only the order of character can be different.
 * @Example1: "abcd" -> "bcad"
 * @Example2: "silent" -> "listen"
 */

public class B_ValidAnagrams {
    public static HashMap<Character, Integer> makeFreqMap(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character key = str.charAt(i);
            if (!mp.containsKey(key)) {
                mp.put(key, 1);
            } else {
                int currFreq = mp.get(key);
                // updating
                mp.put(key, currFreq+1);
            }
        }
        return mp;
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> mp1 = makeFreqMap(s);
        HashMap<Character, Integer> mp2 = makeFreqMap(t);
        return mp1.equals(mp2);
    }

    public static void main(String[] args) {
        //To valid anagram: -
        // 1. The Length of both strings must be same
        // 2. The Frequency of each character must be the same
        // 3. No character must be extra different
        String s = "anagram";
        String t = "ramanag";
        System.out.println(isAnagram(s, t));
    }
}
