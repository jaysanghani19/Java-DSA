package DSA.recursion.subset;

public class SubSetAndSubSequnece {
    public static void main(String[] args) {
        subSequence("abc","");
    }
    static void subSequence(String up,String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char temp = up.charAt(0);
        subSequence(up.substring(1),p+temp);

        subSequence(up.substring(1),p);
    }
}
