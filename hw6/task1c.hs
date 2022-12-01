import Data.List
import Data.Function



{-::[Int] -> [Int]
foo::[Int] -> Int

--foo x = length . filter((> 4) . length . filter Digit)
toDigitList (h:t) = if h > 0 then toDigitList(h `div` 10) ++ [mod h 10] else []
foo(h:t) = if (h > 4) then 1 + foo t else foo t -}
{- foo::[Int] -> [Char] -> Int
foo = map (read . return) . show
-}
--foo::[Int] -> Int
--foo (h:t) = if (h `div` 1000 == 0) then 1 + foo t else foo t

foo::[Int] -> Int
foo list = length $ filter func list
    where
        func::Int -> Bool
        func num = num `div` 1000 == 0
