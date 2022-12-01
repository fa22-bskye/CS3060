Output:

ghci> foo 3 9
945
ghci> foo 1 2
1
ghci> foo 1 3
3
ghci> foo 1 10
945
ghci> foo 1 11
10395


Takes 2 integers, puts it into a range list.
Filters the odd numbers and multiplies them all
using foldl. Uses 2 higher order functions.