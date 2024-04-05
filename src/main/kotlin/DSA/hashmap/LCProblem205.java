package DSA.hashmap;

import java.util.HashMap;

//  Leetcode 205 - https://leetcode.com/problems/isomorphic-strings/
public class LCProblem205 {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) return false;
            } else {
                if (map.containsValue(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
