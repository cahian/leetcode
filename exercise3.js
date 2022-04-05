// Longest Substring Without Repeating Characters
// https://leetcode.com/problems/longest-substring-without-repeating-characters/

const lengthOfLongestSubstring = (str) => {
  const count = {};
  const substr = [];

  let maxlen = 0;
  for (const ch of str) {
    if (count[ch]) {
      substr.push(ch);
      while ((first = substr.shift()) !== ch) {
        count[first] -= 1;
      }
    } else {
      substr.push(ch);
      // Increment an object property value if it exists,
      // else set the initial value.
      count[ch] = (count[ch] || 0) + 1;
    }
    maxlen = Math.max(maxlen, substr.length);
  }
  return maxlen;
};
