package DSA.recursion.subset;

import java.util.*;

//  Problem Statement :- https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
public class LetterOfCombination {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    static HashMap<Character, List<Character>> characterList = new HashMap<>();

    public static List<String> letterCombinations(String digits) {
        characterList.put('2', new ArrayList<>(Arrays.asList('a', 'b', 'c')));
        characterList.put('3', new ArrayList<>(Arrays.asList('d', 'e', 'f')));
        characterList.put('4', new ArrayList<>(Arrays.asList('g', 'h', 'i')));
        characterList.put('5', new ArrayList<>(Arrays.asList('j', 'k', 'l')));
        characterList.put('6', new ArrayList<>(Arrays.asList('m', 'n', 'o')));
        characterList.put('7', new ArrayList<>(Arrays.asList('p', 'q', 'r', 's')));
        characterList.put('8', new ArrayList<>(Arrays.asList('t', 'u', 'v')));
        characterList.put('9', new ArrayList<>(Arrays.asList('w', 'x', 'y', 'z')));

        return solution(new StringBuilder(), digits);
    }

    static List<String> solution(StringBuilder pr, String unPr) {
        if (unPr.length() == 0) {
            return new ArrayList<String>(Collections.singleton(pr.toString()));
        }
        List<String> res = new ArrayList<>();
        char temp = unPr.charAt(0);
        String passingUnPr = unPr.substring(1);
        ArrayList<Character> charcterList = (ArrayList<Character>) characterList.get(unPr.charAt(0));
        for (int i = 0; i < charcterList.size(); i++) {
            pr.insert(pr.length(), charcterList.get(i));
            res.addAll(solution(pr, passingUnPr));
            pr.deleteCharAt(pr.length() - 1);
        }
        return res;
    }
}
