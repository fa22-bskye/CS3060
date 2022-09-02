def foo(n)

    x = 2
    num = n

    first = n * n

    until x == num
        theAnswer = first * n
        first = theAnswer
        x += 1
    end

return theAnswer

end

p foo 6
p foo 5
p foo 7