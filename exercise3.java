/*
 * The solution of N-th Tribonacci Number problem.
 *
 * The description of the problem is in the link below:
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class Solution {
    public int tribonacci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1 || num == 2) {
            return 1;
        }

        int res = 0;
        for (int t0 = 0, t1 = 1, t2 = 1; num > 2; num -= 1) {
            res = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = res;
        }
        return res;
    }
}
