import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/*
 * The solution of Longest Substring Without Repeating Characters problem.
 *
 * The description of the problem is in the link below:
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class Solution {
    public static int lengthOfLongestSubstring(String str) {
        Set<Character> count = new HashSet<>();
        Queue<Character> substr = new ArrayDeque<>();

        int maxlen = 0;
        for (int i = 0; i < str.length(); i += 1) {
            final Character ch = str.charAt(i);
            if (count.contains(ch)) {
                substr.add(ch);
                Character head;
                while ((head = substr.remove()) != ch) {
                    count.remove(head);
                }
            } else {
                substr.add(ch);
                count.add(ch);
            }
            maxlen = Math.max(maxlen, substr.size());
        }
        return maxlen;
    }
}
