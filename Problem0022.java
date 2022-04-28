import java.util.LinkedList;
import java.util.List;

/*
 * The solution of Generate Parentheses problem.
 *
 * The description of the problem is in the link below:
 * https://leetcode.com/problems/generate-parentheses/
 */
public class Solution {
    public static List<String> generateParenthesis(int pairs) {
        /*
         * I tested the solution with LinkedList and ArrayList.
         * The LinkedList resulted in a faster LeetCode solution.
         */
        List<String> result = new LinkedList<>();
        calculate(result, "", pairs, 0, 0);
        return result;
    }

    private static void calculate(List<String> result, String combination, int pairs, int left, int right) {
        if (combination.length() == (pairs * 2)) {
            result.add(combination);
            return;
        }
        if (pairs > left) {
            calculate(result, combination + "(", pairs, left + 1, right);
        }
        if (left > right) {
            calculate(result, combination + ")", pairs, left, right + 1);
        }
    }
}
