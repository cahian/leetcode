// Height Checker
// https://leetcode.com/problems/height-checker/

const insertionSort = (array) => {
  for (let i = 1; i < array.length; i += 1) {
    const val = array[i];

    let j = i;
    while (j > 0 && val < array[j - 1]) {
      array[j] = array[j - 1];
      j -= 1;
    }
    array[j] = val;
  }
};

const heightChecker = (heights) => {
  const expected = [...heights];
  insertionSort(heights);

  let notMatch = 0;
  for (let i = 0; i < heights.length; i += 1) {
    if (heights[i] !== expected[i]) {
      notMatch += 1;
    }
  }
  return notMatch;
};
