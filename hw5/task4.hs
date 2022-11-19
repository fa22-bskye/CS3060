toDigitList::Integer -> [Integer]

-- toDigitList x
--            | x <= 0 = []
--            |otherwise = (x `div` 10): toDigitList(x `mod` 10)
--Function here infinitely loops, does not work but is here as an example.

toDigitList x = if x > 0 then toDigitList(x `div` 10) ++ [mod x 10] else [] --The ++ is concating the the digit to the list, division is recursive
--Takes the integer, if it is a neg outputs the empty list
--If not neg then gets the digits by calling the function again to get the digits.
--The digits are obtained by the modulo of 10, into a list, hence ++ since it concates.

main = print(toDigitList(123456)) --Prints an example.