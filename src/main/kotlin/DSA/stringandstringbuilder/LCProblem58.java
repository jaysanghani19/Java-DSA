package DSA.stringandstringbuilder;

public class LCProblem58 {
    public static void main(String[] args) {
        System.out.println(solution("Hello World"));
    }
    static int solution(String s){
        int length = s.length()-1;
        int ans=0;
        System.out.println("a"+s.charAt(length)+"a");
        System.out.println(s.charAt(length)==' ');
        while(s.charAt(length)==' '){
            length--;
        }
        while(s.charAt(length)!=' '){
            ans++;
            length--;
        }
        return ans;
    }
}
