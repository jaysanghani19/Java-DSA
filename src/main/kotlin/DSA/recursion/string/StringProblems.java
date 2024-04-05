package DSA.recursion.string;

public class StringProblems {
    public static void main(String[] args) {
        String str = "applebcadg";
        StringBuilder ans = new StringBuilder();
        removeApple(str, ans, "apple");
        System.out.println(ans.toString());
    }

    //    Remove 'a' from the string
    static void removeA(String st, int index, StringBuilder ans, char removeChar) {
        if (index == st.length()) {
            return;
        }
        if (st.charAt(index) != removeChar) {
            ans.append(st.charAt(index));
        }
        index++;
        removeA(st, index, ans, removeChar);
    }

    static void removeApple(String st, StringBuilder ans, String removeString) {
        if (st.equals("")) {
            return;
        }
        if (st.length() < removeString.length()) {
            ans.append(st);
            return;
        }
        String pass = "";
        if (!st.startsWith(removeString)) {
            ans.append(st.charAt(0));
            pass = st.substring(1);
        } else {
            pass = st.substring(removeString.length());
        }
        removeApple(pass, ans, removeString);
    }
}
