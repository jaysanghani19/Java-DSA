package DSA.stringandstringbuilder;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println(minimumLength("cabaabac"));
    }

    public static int minimumLength(String s) {
        int start = 0, end = s.length() - 1;
        while (start < s.length() - 1 && end > 0 && s.charAt(start) == s.charAt(end) && start < end) {
            while (start < s.length() - 1 && s.charAt(start + 1) == s.charAt(start) && (end - start) > 1) {
                start++;
            }
            while (end > 0 && s.charAt(end) == s.charAt(end - 1) && (end - start) > 1) {
                end--;
            }
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            }
        }
        return end - start + 1;
    }
}
