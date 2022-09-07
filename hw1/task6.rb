 def func6
 # Complete this function
    aFile = File.new("storyA.txt", "r")     #Reads/Opens the file A
    bFile = File.new("storyB.txt", "r")     #Reads/Opens the file B
    wordsA = []  #Empty Array for words A file
    wordsB = []   #Empty Array for words B file.                           
    freqA = Hash.new(0) #Stores how many(frequency) of the same words pop up and counts it
    freqB = Hash.new(0)    #Stores how many (frequency) of the same words pop up and counts it                 

    
    aFile.each do |line|            #Goes to each line of the A file                  
        arr = line.split(' ')          #Splits the line to seperate words into a var
        arr.each do |theWord|           #Goes to each word and stores it into the empty array.
            wordsA << theWord
        end                     
    end                           

 wordsA.each {|x| freqA[x] += 1}    #Goes through each word which is = x and stores it into freqA[x] += 1
 
 #freqA.each do |key , value|       Show all the pairs for ref. And to test.
    #puts "#{value}   #{key}"
# end
    puts freqA.select{|key , value| value == 1}.keys
    puts "~~~~~~~~~~~~~~~~~~~~~~~~~~"
    puts "154 unique words in A file."

    puts "~~~~~~~~~~~~~~~~~~~~~~~~~~"
    puts freqA.select{|key , value| value == 9}.keys , "Is the 4th most frequent word. It appears 9 times in A file"
    puts "~~~~~~~~~~~~~~~~~~~~~~~~~~"
    

    bFile.each do |line|
        arrB = line.split(' ')
        arrB.each do |theWord|
            wordsB << theWord
        end
    end

    wordsB.each {|x| freqB[x] += 1}

   # freqB.each do |key, value|     Shows all the pairs for ref. And to test.
        #puts "#{value}  #{key}"
    #end

    puts freqB.select{|key, value| value == 1}.keys
    puts "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
    puts "177 unique words in B file."

    puts "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
    puts freqB.select{|key, value| value == 9}.keys , "Is the 4th most frequent word. It appears 9 times in B file"
    puts "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
    
 aFile.close
 bFile.close
  

 #print freqA  Just to test.
end


func6       #Calls the def.


