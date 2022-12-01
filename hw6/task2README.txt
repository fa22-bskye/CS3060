Output:

ghci> biggerCard ((Ten, Hearts),(Jack,Spades))
(Jack,Spades)
ghci> avgValue [(Ten,Spades),(Jack,Spades),(King,Hearts)]
2.3333333333333335
ghci> biggerHand ([(Ten,Spades),(Jack,Spades),(King,Hearts)], [(Ten,Hearts),(Queen,Hearts)])
[(Ten,Spades),(Jack,Spades),(King,Hearts)]

task2 for hw6 in Haskell.

Does the funny card game!
bigger card returns the card with the higher val
avgValue takes a hand and returns the average of the cards
biggerHand takes 2 hands and returns the hand with the higher
avg value.