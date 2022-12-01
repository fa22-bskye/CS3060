--digitCount::Integer -> (Int, Int)

--digs::Integer -> [Int]
--digs 0 = []
--digs x = (x `div` 10) ++ [x `mod` 10]
digits::Integer -> [Int]
digits = map (read . (:[])) . show

digitCount::[Int] -> (Int, Int)
digitCount digits = (odds, evens)
            where odds = length $ filter odd digits
                  evens = length digits - odds 



