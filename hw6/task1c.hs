--foo::[Int] -> Int
--foo (h:t) = if (h `div` 1000 == 0) then 1 + foo t else foo t

foo::[Int] -> Int
foo list = length $ filter func list
    where
        func::Int -> Bool
        func num = num `div` 1000 == 0

--Takes a list, from there calls func with the list num and checks if a 
--digit is >4, by dividing by 1000, from there it filters those numbers
--and outputs the count of the ints that had <4 digits. Length gets
--the result.