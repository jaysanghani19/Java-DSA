package DSA.stringandstringbuilder;

import java.util.Arrays;

public class StringNotes {
    public static void main(String[] args) {
//        String a = "Jay";
//        String b = "Jay";
//        String c = "Jay";

        System.out.println("Jay " + new int[]{1, 3, 5, 5});

//        System.out.println(a==b);
//        System.out.println(a==c);
//        System.out.println(a.equals(b));

        String res = "";
        String a = new String("");
        String b = "";
        String c = "";
        for (int i = 0; i < 26; i++) {
            res += (char) ('a' + i);
            if (i == 1) a = res;
            if (i == 2) b = res;
            if (i == 5) c = res;
        }

        System.out.println(res + " " + a + " " + b + " " + c);
    }
}
