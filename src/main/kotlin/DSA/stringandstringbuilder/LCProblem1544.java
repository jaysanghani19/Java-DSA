package DSA.stringandstringbuilder;

// Leetcode 1544 - https://leetcode.com/problems/make-the-string-great/description/
public class LCProblem1544 {

    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (i < sb.length() - 1 && ((int) sb.charAt(i) == (int) sb.charAt(i + 1) + 32 || (int) sb.charAt(i + 1) == (int) sb.charAt(i) + 32)) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                i = -1;
            }
        }
        return sb.toString();
    }
}
