a = Array.new

def func2 (a) 
    p "Last digit: "
    a.each do |num|
        p num.digits.first
    end

    puts "Integers with less than 4 digits: "
    p a.select {|ints| ints.to_s.length < 4}

    puts "The length of the integers: "
    p a.map {|digit| digit.to_s.length}

    puts "The sum: "
    print a.inject(0) {|start, j| start + j}

end


i = 0
while i < 12
    print "Enter integer: "
    a << gets.to_i
    #p a 
    i += 1
end

func2(a)