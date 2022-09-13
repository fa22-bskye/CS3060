def fileSearch
    f = File.new("file-to-search-in.txt", "r")

    i = 1
    f.each do |line|
        arrWords = line.split(' ')
        #p arrWords

        arrWords.each do |theWord|
            if theWord[0] =~ /[A-Z]/ && theWord[-1] =~ /[a-z]/ && theWord =~ /[aeiou]/
               print "Line#{i}: "
               print arrWords
               puts " "
               #p theWord
            end
        end
        i = i + 1
    end

    f.close
end

fileSearch




