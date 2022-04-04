// Multiples of 3 or 5
// https://projecteuler.net/problem=1

console.log(
  Array.from(Array(1000).keys())
    .filter((num) => num % 3 == 0 || num % 5 == 0)
    .reduce((acc, val) => acc + val)
);
