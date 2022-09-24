puts "Type the name of a file: "

theFile = gets.chomp
Python = "Python"
Ruby = "Ruby"

openFile = File.open(theFile, "r")

openFile.each do |line|
    if f = line.scan( /\b#{Python}\b/i ) #You can also do quotes as well, str interpol.
        puts "The file is important"
    elsif j = line.scan( /\b#{Ruby}\b/i)
        puts "The file is important"
    else
        puts "This file is worthless."
    end
end
