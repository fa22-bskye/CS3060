perfSqr::[Float] -> Int
perfSqr[] = 0

perfSqr(h:t) = if ((sqrt h * sqrt h) == h) then 1 + perfSqr t else perfSqr t
--The perfSqr is recursive, so it adds 1 to perfSqr[] everytime it sees a perfect square :)
--Then it calls the perfSqr to t. The tail, whichever is next in the list.





