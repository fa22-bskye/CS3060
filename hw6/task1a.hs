foo::Int -> Int -> Int

bar::[Int] -> Int
foo x y = bar (filter odd [x..y])

bar c = foldl (*) 1 c
