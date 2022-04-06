// Height Checker
// https://leetcode.com/problems/height-checker/

const heightChecker = (heights) => {
  const expected = [...heights];
  expected.sort((a, b) => a - b);

  let notMatch = 0;
  for (let i = 0; i < heights.length; i += 1) {
    if (heights[i] !== expected[i]) {
      notMatch += 1;
    }
  }
  return notMatch;
};
