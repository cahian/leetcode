// Generate Parentheses
// https://leetcode.com/problems/generate-parentheses/

function generateParenthesis(npairs) {
  const result = [];
  (function recur(size, left, right, combination) {
    if (size === 0) {
      result.push(combination);
    }
    if (npairs > left) {
      recur(size - 1, left + 1, right, combination + "(");
    }
    if (left > right) {
      recur(size - 1, left, right + 1, combination + ")");
    }
  })(npairs * 2, 0, 0, "");
  return result;
}
