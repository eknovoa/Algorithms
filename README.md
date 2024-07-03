# Algorithms

Linear Search:
- We look at every element in an Array or ArrayList starting at the 0th index, and then we iterate until we find the element we are searching for or until we reach the end of the Array or ArrayList.
- The maximum amount of time it will take to find the element we are looking for is the length of the list, n<br>
  Time Complexity: O(n)

Binary Search:
- The time complexity of the binary search is O(log n) because with each iteration, the size of the search space is reduced by half. At each iteration, the algorithm divides the search space in half by comparing the target value with the middle element of the array.

Two Pointers:
- The time complexity is O(n) where n is the number of elements in the array we are iterating through. This is because we are only iterating through the array once using two pointers, and the number of iterations is directly proportional to the length of the array.

Recursion:
- A function that solves a problem by solving smaller instances of the same problem. The function continues to call itself until a base case is reached and then all of the function calls pop off the stack starting with the last one (FILO).
- The time complexity
