puts "Pick a number between 5 and 25."


numGen = gets.chomp.to_i


while (numGen < 5 || numGen > 25)
    puts "Pick a number between 5 and 25."
    numGen = gets.chomp.to_i
end


#coinRand = ['HEADS', 'TAILS']
coinResults = Array.new
coinResults = ()
#coinRand = Array.new
#coinRand = ()


j = 0
h = 0
t = 0
while j < numGen
    theResult = ['HEAD', 'TAIL'].shuffle.first  #Doesnt give errors if you use .shuffle.first
    
    
    if theResult == 'HEAD'              #Also possibly doesnt give "redeclared constant" error if 
        h += 1                             #no 'capital' letter at the front of the variable.
        j += 1
    else
        t += 1
        j += 1
    end
end

puts "#{h} Heads was generated."
puts "#{t} Tails was generated."
puts "#{h} : #{t} is the ratio."



