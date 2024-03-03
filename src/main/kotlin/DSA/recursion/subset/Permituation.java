package DSA.recursion.subset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permituation {
    public static void main(String[] args) {
//        solution(new StringBuilder(),"abcd");
        System.out.println(solution2(new StringBuilder(),"abcd"));
    }
    static void solution(StringBuilder pr,String unPr){
        if (unPr.length()==0){
            System.out.println(pr.toString());
            return;
        }
        char temp = unPr.charAt(0);
        String passingUnPr = unPr.substring(1);
        for (int i = 0; i <= pr.length(); i++) {
            pr.insert(i,unPr.charAt(0));
            solution(pr,passingUnPr);
            pr.deleteCharAt(i);
        }

    }


    static List<String> solution2(StringBuilder pr, String unPr){
        if (unPr.length()==0){
            return new ArrayList<String>(Collections.singleton(pr.toString()));
        }
        List<String> res = new ArrayList<>();
        char temp = unPr.charAt(0);
        String passingUnPr = unPr.substring(1);
        for (int i = 0; i <= pr.length(); i++) {
            pr.insert(i,unPr.charAt(0));
            res.addAll(solution2(pr,passingUnPr));
            pr.deleteCharAt(i);
        }
        return res;
    }
}
