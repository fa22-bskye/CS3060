import scala.io.StdIn.readLine
import scala.io.Source
import java.io.File
import java.io.PrintWriter

def readFunc() ={
var i = 1
    
val writer = new PrintWriter(new File("file.txt"))
        while (i <= 3) {
            print ("Enter: ")
            writer.write(readLine(): String)
            writer.write("\n")
            i+=1
        }
writer.close()

Source.fromFile("file.txt").foreach {x => print(x)}
    
}

readFunc()
