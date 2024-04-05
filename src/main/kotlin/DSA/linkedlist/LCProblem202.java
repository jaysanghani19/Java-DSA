package DSA.linkedlist;

//  Leetcode 202 : https://leetcode.com/problems/happy-number/
public class LCProblem202 {
    public boolean isHappy(int n) {
        int fast = n, slow = n;
        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (fast != slow);

        if (slow == 1) return true;
        return false;
    }

    public static int square(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += (rem * rem);
            n /= 10;
        }
        return ans;
    }
}
