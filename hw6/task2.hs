data Suit = Spades | Hearts deriving (Show)
data Rank = Ten | Jack | Queen | King | Ace deriving (Show)

type Card = (Rank, Suit)
type Hand = [Card]

value::Rank -> Integer
value Ten = 1
value Jack = 2
value Queen = 3
value King = 4
value Ace = 5

biggerCard::(Card,Card) -> Card
biggerCard ((rank1, suit1) , (rank2, suit2)) = if (value rank1 > value rank2 || value rank1 == value rank2) then (rank1, suit1) else (rank2, suit2)

--AVG VAL FOR CARDS-------------------------------------
cardValue::Card -> Double
cardValue (rank,suit) = fromIntegral(value rank)

sumValue::Hand -> Double
sumValue [] = 0
sumValue (h:t) = cardValue h + sumValue t

avgValue::Hand -> Double
avgValue [] = 0
avgValue hand = sumValue hand / fromIntegral(length hand)
----------------------------------------------------------

biggerHand::(Hand, Hand) -> Hand
biggerHand (hand1, hand2) = if (avgValue hand1 > avgValue hand2 || avgValue hand1 == avgValue hand2) then (hand1) else (hand2)