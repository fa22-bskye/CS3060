i = 1       #Used to increment 4 times to grab the users input

puts "Enter 4 lines: "

aFile = File.new("myFile.txt", "w")     #File set to write mode.


while i <= 4            #Loops 4 times, gets input, aFile.write(newLine + Lines)
    Lines =  gets           
    newLine = "L#{i}: "
    aFile.write(newLine + Lines)
    i += 1
end

aFile.close     #Be sure to close the file first before reading.

linesToRead = File.open('myFile.txt')   #Open firstly the file.

j = 1   #Will be used to iterate for each Line.
linesToRead.each do |line|      #Each line will be read.
    print "L#{j}:" 
    print line.length           #Gets the characters in that line.
    print " "
    j+=1
end

aFile.close




