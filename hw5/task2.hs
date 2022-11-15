mults::[Integer] -> [Integer]
mults [] = []
mults (h:t) = if (mod h 3 == 0 || mod h 5 == 0) then h:mults t else mults t