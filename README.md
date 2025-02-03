# Hands-on_Lecture_2
This repository is for CS 3560.02 for our lecture activity solving Pascal's Triangle and 
Spiral Matrix problems.

## Pascal's Triangle
I used a nested for loop to solve Pascal's Triangle and traverse each row one by one.
I would argue that this is O(n) time complexity because I am only traversing through
the triangle for n number of values. I put the test cases inside the main method of the class instead of a
separate file.

## Spiral Matrix
For spiral matrix I used a while loop with two conditions and I traversed through each
row/column one at a time. Since I just iterated through the entire matrix once,
this is O(n*m) time complexity with n being the number of rows and m being the number
of column. I also put the test cases inside the main method of the class instead of a 
separate file.